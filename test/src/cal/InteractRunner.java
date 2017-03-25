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
				out();//operation
                String znak = reader.next();				
                calc.add(znak,Double.valueOf(first), Double.valueOf(second));
				if (znak.equals("/") && second.equals("0")){
					System.out.println("to zero cannot be split");
				}else{
					System.out.println(first+" "+znak+" "+second+" = " + calc.getResult());
				}
				do{
				System.out.println("Use the result of the calculation?\n yes/no");
				String repeat = reader.next();
				if (repeat.equals("yes")){
					System.out.println("Enter  arg : ");
					second = reader.next();
					out();
					znak = reader.next();
					calc.add(znak,calc.getResult(), Double.valueOf(second));
					if (znak.equals("/") && second.equals("0")){
							System.out.println("to zero cannot be split");
							break;
						}else{
							System.out.println(calc.getResult()+" "+znak+" "+second+" = " + calc.getResult());
						}
				}else{
					break;
				}
				}while(true);
                calc.cleanResult();
                System.out.println("Exit : yes/no ");
                exit = reader.next();
            }
		}catch(NumberFormatException e){
			System.out.println("You entered not a number");
		}finally {
            reader.close();
        }		
	}
	public static void out(){
				System.out.println("Choose the operation:");
                System.out.println("Multiplear   *");
                System.out.println("Divide       /");
                System.out.println("Summation    +");
                System.out.println("Subtraction  -");
                System.out.println("Degree       ^");
		}
}
