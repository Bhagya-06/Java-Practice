package commandLineArguments;

public class Example2 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Please provide a string as an input.");
			return;
		}
		
		System.out.println("Welcome " + args[0]);

	}

}
