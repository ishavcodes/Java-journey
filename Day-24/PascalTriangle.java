// Print Pascal's Triangle using nCr function logic --------------------

import java.util.*;
public class PascalTriangle {
    public static int fact(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) f *= i;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=0; i<rows; i++) {
            for(int s=0; s<rows-i; s++) System.out.print(" ");
            for(int j=0; j<=i; j++) {
                System.out.print(fact(i)/(fact(j)*fact(i-j)) + " ");
            }
            System.out.println();
        }
    }
}