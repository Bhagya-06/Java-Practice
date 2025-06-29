package controlStructures;

import java.util.Scanner;

public class SwitchStatement_2 {

	public static void main(String[] args) {
		int month;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month code (1-12):");
		month = sc.nextInt();
		switch(month) {
		case 1: 
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7: 
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
		default:
			name = "Invalid month";
			break;
		}
		System.out.println("Output: " + name);
		sc.close();
	}

}
