package commandLineArguments;

public class Example3 {

	public static void main(String[] args) {
		if(args.length <= 1) {
			System.out.println("Please provide two integers as input.");
			return;
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = num1 + num2;
		System.out.println("The sum of "+ num1 +" and "+ num2 +" is "+ num3);

	}

}
