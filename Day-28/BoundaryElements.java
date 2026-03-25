// Print only the boundary elements of a matrix -----------------------

import java.util.*;

public class BoundaryElements {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(i==0 || j==0 || i==2 || j==2) System.out.print(a[i][j] + " ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}