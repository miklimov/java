package cal;

/**
 * Created by М on 20.03.2017.
 */
public class ArgRunner {
    public static void main(String[] arg) {
        System.out.println("Calculate...");
        if (arg.length == 2) {
            double first = Double.valueOf(arg[0]);
            double second = Double.valueOf(arg[1]);
            String znak = "+";
            Calculator calc = new Calculator();
            calc.add(znak,first, second);
            System.out.println("Sum : " + calc.getResult());
        } else {
            System.out.println("Enter two paramenters.");
        }
    }
}
