// Calculate sum of each row and each column separately ------------------------------

import java.util.*;

public class RowSumColumnSum {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        for(int i=0; i<2; i++) {
            int rSum = 0;
            for(int j=0; j<2; j++) rSum += a[i][j];
            System.out.println("Row " + i + " sum: " + rSum);
        }
        for(int j=0; j<2; j++) {
            int cSum = 0;
            for(int i=0; i<2; i++) cSum += a[i][j];
            System.out.println("Col " + j + " sum: " + cSum);
        }
    }
}