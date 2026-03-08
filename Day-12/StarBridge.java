// code for Star Bridge Pattern ------------------

public class StarBridge{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            System.out.print("*");
            for (int j = 1; j < 2 * i - 2; j++){
                System.out.print("  ");
            }
            if (i > 1){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}