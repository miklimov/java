package cal;

/**
 * Created by М on 20.03.2017.
 */
import java.util.Scanner;

/**
 * Класс для запуска калькулятора. Поддерживает ввод пользователя.
 */
public class InteractRunner {

    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg : ");
                String first = reader.next();
                System.out.println("Enter second arg : ");
                String second = reader.next();
                System.out.println("Choose the operation:");
                System.out.println("Multiplear   *");
                System.out.println("Divide       /");
                System.out.println("Summation    +");
                System.out.println("Subtraction  -");
                System.out.println("Degree       ^");
                String znak = reader.next();
                calc.add(znak,Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result : " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit : yes/no ");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}
