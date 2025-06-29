package controlStructures;

import java.util.Scanner;

public class WhileLoop_2 {

	public static void main(String[] args) {
		int num, rev=0,org;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		num = sc.nextInt();
		org = num;
		while(num!=0) {
			rev = (rev*10) + (num%10);
			num/=10;
		}
		if(org==rev) System.out.println(org + " is a palindrome.");
		else System.out.println(org + " is not a palindrome.");
	}

}
