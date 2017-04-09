package mb;

import java.util.Random;
import java.util.Scanner;

/**
 * Ввод пользователя
 */
public class DotHelper {
    /*
    Инициализация объекта сканер
     */
    private Scanner s = new Scanner(System.in);
    /*
    Число введенное пользователем
     */
    private String userGuessOut;
    /*
    Инициализация для рандома
     */
    private Random r = new Random();
    /**
     * Ввод пользователя
     * @return возвращаем что ввел пользователь
     */

    public String inputUser(String Input){
        System.out.println(Input);
        userGuessOut = s.next();
        return userGuessOut;
    }

    /**
     * Метод возвращенися случайного числа в диапозоне от 0 до num
     * @param num
     * @return случайное число
     */
    public int getRandomNumber(int num){
        int startCells=0;
        return startCells = r.nextInt(num);
    }
}
