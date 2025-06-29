package controlStructures;

import java.util.Scanner;

public class SwitchStatement_1 {

	public static void main(String[] args) {
		char code;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a color code (R,B,G,O,Y,W):");
		code = sc.next().charAt(0);
		switch(code) {
		case 'R': 
			name = "Red";
			break;
		case 'B':
			name = "Blue";
			break;
		case 'G':
			name = "Green";
			break;
		case 'O':
			name = "Orange";
			break;
		case 'Y':
			name = "Yellow";
			break;
		case 'W':
			name = "White";
			break;
		default:
			name = "Invalid code";
			break;
		}
		System.out.println("Output: " + name);
		sc.close();
	}

}
