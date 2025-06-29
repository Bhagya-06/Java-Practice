package controlStructures;

import java.util.Scanner;

public class IfStatement_4 {

	public static void main(String[] args) {
		char a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		a = sc.next().charAt(0);
		if((a>='a' && a<='z') || (a>='A' && a<='Z')) System.out.println("Alphabet");
		else if(a>='0' && a<='9') System.out.println("Digit");
		else System.out.println("Special Character");
		sc.close();
	}

}
