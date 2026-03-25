// Find the largest element in the entire 2D array ----------------------

import java.util.*;

public class MaxInMatrix {
    public static void main(String[] args) {
        int[][] a = {{5, 8}, {12, 7}};
        int max = a[0][0];
        for(int[] row : a)
            for(int val : row) if(val > max) max = val;
        System.out.println("Max Element: " + max);
    }
}