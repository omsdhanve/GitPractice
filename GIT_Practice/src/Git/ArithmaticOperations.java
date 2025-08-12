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
	}
	
	// Addition Logic by Dev2
	public static int Addition(int x, int y) {
		return x+y;
	}
}
