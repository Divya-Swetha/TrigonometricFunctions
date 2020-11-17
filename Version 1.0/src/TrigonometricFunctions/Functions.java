
/**
* Functions.java
* purpose:  to code the trigonometric functions sin, cos, tan in both radian and degree
* To integrate Junit testing
*
* @authors Team 8
* @version November 7, 2020
*/
package TrigonometricFunctions;
import java.util.Scanner;

public class Functions {
	
	private static final double PI = 3.14159265358979323846; // value of pi
	
	public static void main(String args[]) {
		
		System.out.print("Enter the degree that is to be calculated: ");
		Scanner sc = new Scanner(System.in);	
		double value = sc.nextDouble();
		System.out.println("sin value: "+sinr(value));
		System.out.println("sin value using Math library: "+Math.sin(value)); // displays sin value using math library
		System.out.println("Cos value: "+cosr(value));
		System.out.println("Cos value using Math library: "+Math.cos(value)); // displays cos value using math library
		System.out.println("Tan value: "+tanr(value));
		System.out.println("Tan value using Math library: "+Math.tan(value)); // displays tan value using math library
	}
	
	/*
	 * To calculate power of a value
	 */
	
	public static double power(double p, int i) {
		double r=1;
		return r;	}	
	
	/*
	 * To calculate factorial of a value
	 */
	
	public static double factorial(double f) 
	{
		double r=1;
		return r;
	 }
	
	/*
	 * To calculate sin value in radian
	 */
	
	public static double sinr(double a) { 
		double r=1;
		return r;
	}
	
	/*
	 * To calculate Cos value in radian
	 */
	
	public static double cosr(double a) {
		double r=1;
		return r;
	}
	
	/*
	 * To calculate tan value in radian
	 */
	
	public static double tanr(double a) {
		double r=1;
		return r;
	}
	/*
	 * Function to convert degree to radian
	 */
	public static double degreeToradian(double n) { 
		double r=1;
		return r;
	}
	
	/*
	 * To calculate sin value in Degree
	 */
	
	public static double sind(double x) {
		double r=1;
		return r;
	}
	
	/*
	 * To calculate cos value in Degree
	 */
	
	public static double cosd(double x) {
		double r=1;
		return r;
	}
	/*
	 * To calculate tan value in degree 
	 */
	
	public static double tand(double x) {		
		double r=1;
		return r;
	}	
	
}

