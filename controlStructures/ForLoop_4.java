package controlStructures;

public class ForLoop_4 {

	public static void main(String[] args) {
		
		for(int i=10; i<=99; i++) {
			int flag = 0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) System.out.println(i);
		}
	}

}
