package controlStructures;

import java.util.Scanner;

public class IfStatement_5 {

	public static void main(String[] args) {
		String gender;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender (Male or Female): ");
		gender = sc.next();
		System.out.println("Enter age: ");
		age = sc.nextInt();
		if(gender.equals("Female")) {
			if(age>=1 && age<=58) System.out.println("Your percentage of interest is 8.2%");
			else if(age>=59 && age<=100) System.out.println("Your percentage of interest is 9.2%");
		}
		else if(gender.equals("Male")) {
			if(age>=1 && age<=58) System.out.println("Your percentage of interest is 8.4%");
			else if(age>=59 && age<=100) System.out.println("Your percentage of interest is 10.5%");
		}
		else System.out.println("Enter correct input values.");
		sc.close();
	}

}
