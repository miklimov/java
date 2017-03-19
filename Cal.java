import java.awt.geom.Arc2D;
import java.util.Scanner;
import java.lang.Math;
public class Cal{
	public static void main(String[] arg){
		String i1,i2,znak,otvet;
		System.out.println("Calculate..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number:");
		i1 = sc.next();
		System.out.println("Input second number:");
		i2 = sc.next();
		System.out.println("Choose the operation:");
		System.out.println("Multiplear   *");
		System.out.println("Divide       /");
		System.out.println("Summation    +");
		System.out.println("Subtraction  -");
		System.out.println("Degree       ^");
		znak = sc.next();
		switch(znak) {
			case "*":
				otvet = multiplear(i1,i2);
				output(i1,i2,znak,otvet);
				break;
			case "/":
				otvet = divide(i1,i2);
				output(i1,i2,znak,otvet);
				break;
			case "-":
				otvet = substraction(i1,i2);
				output(i1,i2,znak,otvet);
				break;
			case "+":
				otvet = summation(i1,i2);
				output(i1,i2,znak,otvet);
				break;
			case "^":
				otvet = degree(i1,i2);
				output(i1,i2,znak,otvet);
				break;
			default:
				System.out.println("Error!!!");
				break;
		}
	}
	public static void output(String i1,String i2, String znak,String otvet){
		System.out.println(i1+" "+znak+" "+i2+" = "+ otvet);
	}
	public static String multiplear(String i1,String i2){
		int x1,x2,o;
		String otvet;
		x1 = Integer.parseInt(i1);
		x2 = Integer.parseInt(i2);
		o = x1*x2;
		otvet = Integer.toString(o);
		return otvet;
	}

	public static String divide(String i1,String i2){
		int x1,x2,o;
		String otvet;
		x1 = Integer.parseInt(i1);
		x2 = Integer.parseInt(i2);
		o = x1/x2;
		otvet = Integer.toString(o);
		return otvet;
	}
	public static String summation(String i1,String i2){
		int x1,x2,o;
		String otvet;
		x1 = Integer.parseInt(i1);
		x2 = Integer.parseInt(i2);
		o = x1+x2;
		otvet = Integer.toString(o);
		return otvet;
	}
	public static String substraction(String i1,String i2){
		int x1,x2,o;
		String otvet;
		x1 = Integer.parseInt(i1);
		x2 = Integer.parseInt(i2);
		o = x1-x2;
		otvet = Integer.toString(o);
		return otvet;
	}
	public static String degree(String i1,String i2){
		double x1,x2,o;
		String otvet;
		x1 = Double.parseDouble(i1);
		x2 = Double.parseDouble(i2);
		o = Math.pow(x1, x2);
		otvet = Double.toString(o);
		return otvet;
	}

}