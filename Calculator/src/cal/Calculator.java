package cal;
import java.lang.Math;
/**
 * Created by М on 20.03.2017.
 */
public class Calculator {
    /**
     Результат вычисления.
     */
    private int result;
    /**
     * Суммируем аргументы.
     * @param params Аргументы суммирования.
     */
    public void add(String znak,int ... params) {
        switch(znak) {
            case "*":
                this.result = params[0]*params[1];
                break;
            case "/":
                this.result = params[0]/params[1];
                break;
            case "+":
                for (int param : params) {
                    this.result += param;
                }
                break;
            case "-":
                this.result = params[0]-params[1];
                break;
            case "^":
                this.result = (int) Math.pow(params[0],params[1]);
                break;
            default:
                System.out.println("Error!!!");
                break;
        }
    }
    /**
     * Получить результат.
     * @return результат вычисления.
     */
    public int getResult() {
        return this.result;
    }
    /**
     * Очистить результат вычисления.
     */
    public void cleanResult() {
        this.result = 0;
    }
}
