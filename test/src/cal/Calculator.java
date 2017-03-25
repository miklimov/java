package cal;
import java.lang.Math;
/**
 * Класс калькулятор.
 */
public class Calculator {
    /**
     Результат вычисления.
     */
    private double result;
	
    /**
     * Вычисление сложения, деления, умножение, вычитание, возведение в степень.
	 * @znak знак вычисления
     * @first первый аргумент 
	 * @second второй аргумент
     */
	public void add(String znak,double first, double second) {
		try{
			switch(znak) {
				case "*":
					this.result = first*second;
					break;
				case "/":
					this.result = first/second;
					break;
				case "+":
					this.result = first+second;					
					break;
				case "-":
					this.result = first-second;
					break;
				case "^":
					this.result = Math.pow(first,second);
					break;
				default:
					System.out.println("Error!!!");
					break;
			}
		}catch(Exception e){
			System.out.println("Error");
		}
    }
    /**
     * Получить результат.
     * @return результат вычисления.
     */
    public double getResult() {
        return this.result;
    }
    /**
     * Очистить результат вычисления.
     */
    public void cleanResult() {
        this.result = 0;
    }
}
