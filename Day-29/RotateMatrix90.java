// Rotate a square matrix 90 degrees clockwise --------------------

import java.util.*;

public class RotateMatrix90 {
    public static void rotate(int[][] a, int n) {
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int temp = a[i][j]; a[i][j] = a[j][i]; a[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n/2; j++) {
                int temp = a[i][j]; a[i][j] = a[i][n-1-j]; a[i][n-1-j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}}; rotate(a, 2);
        for(int[] r : a) System.out.println(Arrays.toString(r));
    }
}