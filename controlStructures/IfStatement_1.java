package controlStructures;

import java.util.Scanner;

public class IfStatement_1 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		a = sc.nextInt();	
		if(a==0) System.out.println("You entered zero.");
		else if (a>0) System.out.println("You entered a positive integer.");
		else System.out.println("You entered a negative integer.");
		sc.close();
	}

}
