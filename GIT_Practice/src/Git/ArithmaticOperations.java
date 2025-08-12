package Git;

import java.util.Scanner;

public class ArithmaticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		int x = sc.nextInt();
		System.out.print("Enter 1st Number:");
		int y = sc.nextInt();
		
		double addn = Addition(x, y);
		System.out.println("Adddition is: "+addn);
		
		double subt = subtraction(x, y);
		System.out.println("Subtraction is: "+subt);
	}
	
	// Addition Logic by Dev2
	public static double Addition(double x, double y) {
		return x+y;
	}
	
	// Subtraction Logic by Dev1
	public static double subtraction(double x, double y) {
		//return x-y;
	}
}
