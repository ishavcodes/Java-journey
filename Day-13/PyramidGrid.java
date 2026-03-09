// code for Pyramid Grid Pattern ------------------

public class PyramidGrid{
    public static void main(String[] args) {
        for (int k = 0; k < 2; k++) { 
            for (int i = 1; i <= 3; i++) { 
                for (int m = 0; m < 3; m++) { 
                    for (int j = 1; j <= 3 - i; j++) System.out.print(" ");
                    for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
                    for (int j = 1; j <= 3 - i; j++) System.out.print(" ");
                    System.out.print("  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}