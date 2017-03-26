package cal;

import java.util.Scanner;

/**
 * Класс для запуска калькулятора. Поддерживает ввод пользователя.
 */
public class InteractRunner {
	/**
	* Параметр для запоминания прошлого результата
	*/
	private  static String parent;
	/**
	* Параметр для запоминания знака
	*/
	private static String znak;
	/**
	* Параметр для запоминания второго числа
	*/
	private static String second;
	
    public static void main(String[] arg) {
		Calculator calc = new Calculator();
        Scanner reader = new Scanner(System.in);
        try {
            String exit = "n";
			/*Проверка на выход из калькулятора*/
            while (!exit.equals("y")) {
                System.out.println("Enter first arg : ");
                String first = reader.next();
                System.out.println("Enter second arg : ");
                second = reader.next();
				/*Вывод операций*/
				outOperation();
                znak = reader.next();               
				/*Вывод результата*/
				outResult(znak, first, second);
				/*Повторное использование*/
				reapeatResult();
				calc.cleanResult();
                System.out.println("Exit : y/n ");
                exit = reader.next();
            }
		}catch(NumberFormatException e){
			System.out.println("You entered not a number");
		}finally {
            reader.close();
        }		
	}
	/**
	* Вывод возможных операций.
	*/
	public static void outOperation(){
				System.out.println("Choose the operation:");
                System.out.println("Multiplear   *");
                System.out.println("Divide       /");      
                System.out.println("Degree       ^");
	}
	/**
	*Вывод результата рассчета.
	*@znak знак операции
	*@first первое значение
	*@second второе значение
	*/
	public static void outResult(String znak, String first, String second){
		Calculator calc = new Calculator();
		calc.add(znak,Double.valueOf(first), Double.valueOf(second));
		parent= String.valueOf(calc.getResult());
		if (znak.equals("/") && second.equals("0")){
			System.out.println("to zero cannot be split");
		}else{
			System.out.println(first+" "+znak+" "+second+" = " + calc.getResult());
		}
	}
	/**
	*Повторное использование результатов расчетов
	*/
	public static void reapeatResult(){
		Scanner r = new Scanner(System.in);
	
		do{
			System.out.println("Use the result of the calculation?\n y/n");
			String repeat = r.next();
			if (repeat.equals("y")){
				System.out.println("Enter arg : ");
				second = r.next();
				/*Вывод операций*/
				outOperation();
				znak = r.next();
				System.out.println(parent);
				outResult(znak,parent,second);
			}else{
				break;
			}
		}while(true);
	}
}
