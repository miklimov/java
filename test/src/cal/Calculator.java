package cal;
import java.lang.Math;
/**
 * Created by М on 20.03.2017.
 */
public class Calculator {
    /**
     Результат вычисления.
     */
    private double result;
    /**
     * Суммируем аргументы.
     * @param params Аргументы суммирования.
     */
	
	public void add(String znak,double ... params) {
		try{
			switch(znak) {
				case "*":
					this.result = params[0]*params[1];
					break;
				case "/":
					this.result = params[0]/params[1];
					break;
				case "+":
					this.result = params[0]+params[1];
					
					break;
				case "-":
					this.result = params[0]-params[1];
					break;
				case "^":
					this.result = (double) Math.pow(params[0],params[1]);
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
