package controlStructures;

public class WhileLoop_3 {

    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i <= 5) {
            if (j % 2 == 0 && j % 3 == 0 && j % 5 == 0) {
                System.out.println(j);
                i++;
                }
            j++;
        }
    }
}
