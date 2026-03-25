// Multiply each element of matrix by a given number (K) -----------------------

import java.util.*;

public class ScalarMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int k = 5;
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                a[i][j] *= k;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}