// Multiply two matrices using a dedicated function --------------------

import java.util.*;

public class MatrixMultiplication {
    public static void multiply(int[][] A, int[][] B, int r1, int c1, int r2, int c2) {
        if (c1 != r2) { System.out.println("Invalid Dimensions"); return; }
        int[][] C = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) C[i][j] += A[i][k] * B[k][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}}, B = {{1, 1}, {1, 1}};
        multiply(A, B, 2, 2, 2, 2);
    }
}