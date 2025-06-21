package commandLineArguments;

public class Example1 {

	public static void main(String[] args) {
		if(args.length <= 1) {
			System.out.println("Please provide two strings as an input.");
			return;
		}
		
		System.out.println(args[0] + " Technologies " + args[1]);
	}

}
