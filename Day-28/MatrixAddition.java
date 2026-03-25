// Add two matrices of the same size --------------------

import java.util.*;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {{1, 1}, {1, 1}}, b = {{2, 2}, {2, 2}};
        int[][] res = new int[2][2];
        for(int i=0; i<2; i++)
            for(int j=0; j<2; j++) res[i][j] = a[i][j] + b[i][j];
        for(int[] row : res) System.out.println(Arrays.toString(row));
    }
}