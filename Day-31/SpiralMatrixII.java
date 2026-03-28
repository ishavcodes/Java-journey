// Given n, generate an n x n matrix filled with spiral 1 to n^2 ----------------------------------

import java.util.*;

public class SpiralMatrixII{
    public static void main(String[] args){
        int n = 3;
        int val = 1;
        int[][] res = new int[n][n];
        int r1 = 0, r2 = n - 1, c1 = 0, c2 = n - 1;
        while(r1 <= r2 && c1 <= c2){
            for(int i = c1; i <= c2; i++){
                res[r1][i] = val++;
            }
            r1++;
            for (int i = r1; i <= r2; i++){
                res[i][c2] = val++;
            }
            c2--;
            if(r1 <= r2){
                for (int i = c2; i >= c1; i--){
                res[r2][i] = val++;
                }
                r2--;
            }
            if(c1 <= c2){
                for (int i = r2; i >= r1; i--){
                res[i][c1] = val++;
                }
                c1++;
            }
        }
        for(int[] row : res){
            System.out.println(Arrays.toString(row));
        }
    }
}