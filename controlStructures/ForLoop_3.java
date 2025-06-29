package controlStructures;

import java.util.Scanner;

public class ForLoop_3 {

	public static void main(String[] args) {
		int num, flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		num = sc.nextInt();
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag = 1;
				break;
			}
		}
		if(flag==0) System.out.println(num + " is a prime number.");
		else System.out.println(num + " is not a prime number.");
		sc.close();
	}

}
