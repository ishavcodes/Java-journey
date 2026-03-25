// Find the position (row, col) of an element in matrix -----------------

import java.util.*;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] a = {{10, 20}, {30, 40}};
        int target = 20;
        for(int i=0; i<2; i++)
            for(int j=0; j<2; j++)
                if(a[i][j] == target) System.out.println("Found at: " + i + "," + j);
    }
}