package sb;

import java.util.*;
/**
 * Класс игры потопи сайт
 */
public class DotComBust {
    /**
     * Старт игры потопи сайт
     * @param args
     */
    public static void main (String[]args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();

    }
    /*
    Инициализация объекта вспомогательного класса
     */
    private GameHelper helper = new GameHelper ();
    /*
    Аррейлист для объектов дотком
     */
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    /*
    Счетчик ходов пользователя
     */
    private int numOfGuesses = 0;

    /**
     * Инициализация сайтов и их размещение
     */
    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("Ваша цель потопить три сайта");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество шагов.");
        /*Цикл по коллекции dotComsList*/
        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    /**
     * Ввод от пользователя
     */
    private void startPlaying(){
        while (!dotComsList.isEmpty ()) {
            String userGuess = helper.getUserlnput ("Сделать ход");
            checkUserGuess(userGuess);
        }
        finishGame () ;
    }

    /**
     * Проверка на попадание
     * @param userGuess ввод пользователя
     */
    private void checkUserGuess (String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
            System.out.println(result);
        }

    /**
     * Завершение игры
     */
    private void finishGame() {
            System.out.println("Все сайты утанули");
            if (numOfGuesses <= 18) {
                System.out.println("Вы утопили за " + numOfGuesses + " попыток");
            } else {
                System.out.println("Капец, за " + numOfGuesses + " попыток");
            }
        }
}
