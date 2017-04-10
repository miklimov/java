package cal;

/**
 * Created by М on 20.03.2017.
 */
public class ArgRunner {
    public static void main(String[] arg) {
        System.out.println("Calculate...");
        if (arg.length == 2) {
            int first = Integer.valueOf(arg[0]);
            int second = Integer.valueOf(arg[1]);
            String znak = "+";
            Calculator calc = new Calculator();
            calc.add(znak,first, second);
            System.out.println("Sum : " + calc.getResult());
        } else {
            System.out.println("Enter two paramenters.");
        }
    }
}
