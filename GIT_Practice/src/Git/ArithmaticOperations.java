package Git;

import java.util.Scanner;

public class ArithmaticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		int x = sc.nextInt();
		System.out.print("Enter 1st Number:");
		int y = sc.nextInt();
		
		int addn = Addition(x, y);
		System.out.println("Adddition is: "+addn);
		
		int subt = subtraction(x, y);
		System.out.println("Adddition is: "+subt);
	}
	
	// Addition Logic by Dev2
	public static int Addition(int x, int y) {
		return x+y;
	}
	
	// Subtraction Logic by Dev1
	public static int subtraction(int x, int y) {
		return x-y;
	}
}
