import java.util.Scanner;
import java.lang.Math;
public class Cal{
	public static void main(String[] arg){
		System.out.println("Calculate..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number:");
		double i1 = sc.nextDouble();
		System.out.println("Input second number:");
		double i2 = sc.nextDouble();
		System.out.println("Choose the operation:");
		System.out.println("Multiplear   *");
		System.out.println("Divide       /");
		System.out.println("Summation    +");
		System.out.println("Subtraction  -");
		System.out.println("Degree       ^");
		String znak = sc.next();
		switch(znak) {
			case "*":
				multiplear(i1,i2,znak);
				break;
			case "/":
				divide(i1,i2,znak);
				break;
			case "-":
				substraction(i1,i2,znak);
				break;
			case "+":
				summation(i1,i2,znak);
				break;
			case "^":
				degree(i1,i2,znak);
				break;
			default:
				System.out.println("Error!!!");
				break;
		}
	}
	/*
	Вывод результатов
	*/
	public static void output(double i1,double i2, String znak,String otvet){
		System.out.println(i1+" "+znak+" "+i2+" = "+ otvet);
	}
	public static void output(int i1,int i2, String znak,String otvet){
		System.out.println(i1+" "+znak+" "+i2+" = "+ otvet);
	}
	public static void output(short i1,short i2, String znak,String otvet){
		System.out.println(i1+" "+znak+" "+i2+" = "+ otvet);
	}
	public static void output(float i1,float i2, String znak,String otvet){
		System.out.println(i1+" "+znak+" "+i2+" = "+ otvet);
	}
	public static void output(long i1,long i2, String znak,String otvet){
		System.out.println(i1+" "+znak+" "+i2+" = "+ otvet);
	}
	/*
	Умножение
	 */
	public static void multiplear(double i1,double i2,String znak){
		String otvet = Double.toString(i1*i2);
		output(i1,i2,znak,otvet);
	}
	public static void multiplear(int i1,int i2,String znak){
		String otvet = Integer.toString(i1*i2);
		output(i1,i2,znak,otvet);
	}
	public static void multiplear(short i1,short i2,String znak){
		String otvet = Integer.toString(i1*i2);
		output(i1,i2,znak,otvet);
	}

	public static void multiplear(float i1,float i2,String znak){
		String otvet = Double.toString(i1*i2);
		output(i1,i2,znak,otvet);
	}
	public static void multiplear(long i1,long i2,String znak){
		String otvet = Double.toString(i1*i2);
		output(i1,i2,znak,otvet);
	}
	/*-------------------------------*/
	public static void divide(double i1,double i2,String znak){
		String otvet = Double.toString(i1/i2);
		output(i1,i2,znak,otvet);
	}
	public static void summation(double i1,double i2,String znak){
		String otvet = Double.toString(i1+i2);
		output(i1,i2,znak,otvet);
	}
	public static void substraction(double i1,double i2,String znak){
		String otvet = Double.toString(i1-i2);
		output(i1,i2,znak,otvet);
	}
	public static void degree(double i1,double i2,String znak){
		String otvet = Double.toString(Math.pow(i1,i2));
		output(i1,i2,znak,otvet);
	}

}