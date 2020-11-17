
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
		double value = 1;
        while (i != 0)
        {
            value *= p;
            --i;
        }
        return value; // Returns power of the value
	}
	
	/*
	 * To calculate factorial of a value
	 */
	
	public static double factorial(double f) 
	{
		if(f == 0){
			return 1;
		} 
	    return f*factorial(f-1);  // Returns factorial value
	 }
	
	/*
	 * To calculate sin value in radian
	 */
	
	public static double sinr(double a) { 
		
		if (a == Double.NEGATIVE_INFINITY || !(a < Double.POSITIVE_INFINITY)) {
			return Double.NaN;
	    }
		a %= 2*PI; // period of sine function
	    if (a<0) {
	        a = 2*PI - a; // Converts negative angle
	    }
	    final int term = 20;
	    double rad = 0;
	    for (int i = 0; i <= term; i++) {
	        rad += power(-1, i) * (power(a, 2*i + 1) / factorial(2 * i + 1));
	        }
	    return rad; // Returns radian value of sin function
	}
	
	/*
	 * To calculate Cos value in radian
	 */
	
	public static double cosr(double a) {
		
		if (a == Double.NEGATIVE_INFINITY || !(a < Double.POSITIVE_INFINITY)) {
			return Double.NaN;
	    }
		a %= 2*PI; // Period of cos function
	    if (a<0) {
	        a = 2*PI - a; // Converts negative angle
	    }
	    final int term = 20;
	    double rad = 0;
	    for (int i = 0; i <= term; i++) {
	        rad += power(-1, i) * (power(a, 2*i) / factorial(2*i));
	        }
	    return rad; // Returns cos value in radian
	}
		
	/*
	 * To calculate tan value in radian
	 */
	
	public static double tanr(double a) {
		
		return sinr(a)/cosr(a); // Returns tan value in radian

	}
	/*
	 * Function to convert degree to radian
	 */
	public static double degreeToradian(double n) { 
		
		return n*PI/180.0; // Returns radian value

	}
	
	/*
	 * To calculate sin value in Degree
	 */
	
	public static double sind(double x) {
		
		double finalValue = degreeToradian(x);
		return sinr(finalValue);
	}
	
	/*
	 * To calculate cos value in Degree
	 */
	
	public static double cosd(double x) {

		double finalValue = degreeToradian(x);
		return cosr(finalValue);

	}
	/*
	 * To calculate tan value in degree 
	 */
	
	public static double tand(double x) {		
		
		double finalValue = degreeToradian(x);
		return tanr(finalValue);
		
	}	
	
}

