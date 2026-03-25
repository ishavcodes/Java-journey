// Input and print a 2D array in matrix format ---------------------------

import java.util.*;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows & Cols: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(int i=0; i<r; i++) 
            for(int j=0; j<c; j++) matrix[i][j] = sc.nextInt();

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}