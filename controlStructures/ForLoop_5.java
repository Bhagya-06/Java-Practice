package controlStructures;

import java.util.*;

public class ForLoop_5 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		for(int i=1; i<=num ; i++) {
			for(int j=1; j<=num; j++) {
				if(j<=i) System.out.print(" * ");
			}
			System.out.println();
		}
		sc.close();
	}

}
