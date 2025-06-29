package controlStructures;

import java.util.Scanner;

public class WhileLoop_1 {

	public static void main(String[] args) {
		int num, rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		num = sc.nextInt();
		while(num!=0) {
			rev = (rev*10) + (num%10);
			num/=10;
		}
		System.out.println(rev);
	}

}
