// Check if a matrix is an Identity Matrix ---------------------

import java.util.*;

public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 0}, {3, 1}};
        boolean isIden = true;
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                if(i == j && a[i][j] != 1) isIden = false;
                if(i != j && a[i][j] != 0) isIden = false;
            }
        }
        System.out.println(isIden ? "Identity Matrix" : "Not Identity");
    }
}