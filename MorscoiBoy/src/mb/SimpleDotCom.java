package mb;

import java.util.ArrayList;
/***
 * Класс игра потопи сайт
 */
public class SimpleDotCom {
    /*
    Массив положения сайта
     */
    private int[] locationCells;
    /*
    Количество попаданий
     */
    private int numOfHits = 0;
    /*
    Признак повторного ввода
     */
    private boolean repeat = false;
    /*
    Массив для проверки пользовательского ввода
     */
    private ArrayList<String> Arr = new ArrayList<String>();

    /**
     * Сеттер для массива положения сайта
     * @param Iocs массив положения сайта
     */
    public void setLocationCells(int[] Iocs) {
        locationCells = Iocs;
    }

    /**
     * Проверка на дублирование ввода пользователя
     * @param stringGuess что ввел пользователь
     * @return возращаем был ли раньше такой ввод
     */
    private boolean checkrepeat(String stringGuess) {
        if(!Arr.isEmpty()){
            if (Arr.contains(stringGuess)){
                return repeat = true;
            }
        }
        Arr.add(stringGuess);
        return repeat=false;
    }

    /***
     * Проверка на попадание и потопление сайта
     * @param stringGuess ввод от пользователя
     * @return
     */
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        if (!checkrepeat(stringGuess)) {
            for (int cell : locationCells) {
                if (guess == cell) {
                    result = "Попал";
                    numOfHits++;
                    break;
                }
            }
        }else{
            result = "Ход уже был";
        }
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}