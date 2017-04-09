package clinic;

import java.util.Scanner;

/***
 *Запуск приложения
 */
public class RunnerClinic{
    public static void main(String[] args) {
        final Clinic clinic = new Clinic();
        boolean exit = true;
        Scanner scan = new Scanner(System.in);
        while (exit) {
            clinic.startMenu();
            System.out.println("Выйти - (y/n):");
            String input = scan.next();
            if(input.equals("y")){
                exit = false;
            }
        }
    }
}