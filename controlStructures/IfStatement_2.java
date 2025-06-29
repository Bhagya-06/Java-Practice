package controlStructures;

import java.util.Scanner;

public class IfStatement_2 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		a = sc.nextInt();	
		if(a%2==0) System.out.println("You entered an even number.");
		else System.out.println("You entered an odd number.");
		sc.close();
	}

}
