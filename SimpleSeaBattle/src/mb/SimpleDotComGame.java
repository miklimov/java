package mb;
/**
 * Старт игры потопи сайт
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        /*Создание объекта для игры, логика игры*/
        SimpleDotCom dot = new SimpleDotCom();
        /*Объект настройки игры*/
        DotHelper helper = new DotHelper();
        int startCells = helper.getRandomNumber(5);
        int[] locations = {startCells, startCells+1, startCells+2};
        dot.setLocationCells(locations);
        String result,userGuess;
        int inc = 0;
        do {
            userGuess = helper.inputUser("Введите число:");
            result = dot.checkYourself(userGuess);
            inc++;
        }while(!result.equals("Потопил"));
        System.out.println("Вы угадали с: "+inc+" попыток");
    }
}