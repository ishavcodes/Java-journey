// Find sum of primary and secondary diagonals ---------------------

import java.util.*;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int primary = 0, secondary = 0;
        for(int i=0; i<3; i++) {
            primary += a[i][i];
            secondary += a[i][3-1-i];
        }
        System.out.println("Primary: " + primary + ", Secondary: " + secondary);
    }
}