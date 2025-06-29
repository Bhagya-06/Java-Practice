package controlStructures;

import java.util.Scanner;

public class IfStatement_6 {

	public static void main(String[] args) {
		char a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet: ");
		a = sc.next().charAt(0);	
		if(a>='A' && a<='Z') System.out.println("Output: " + (char)(a+32));
		else if(a>='a' && a<='z') System.out.println("Output: " + (char)(a-32));
		else System.out.println("Please enter only alphabet.");
		sc.close();
	}

}
