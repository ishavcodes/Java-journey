// Minimize the difference between max and min chocolates given ------------------------------

import java.util.*;

public class ChocolateDistribution{
    public static void main(String[] args){
        int[] a = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        Arrays.sort(a);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i <= a.length - m; i++){
            int diff = a[i + m - 1] - a[i];
            if(diff < minDiff){
                minDiff = diff;
            }
        }
        System.out.println("Min Difference : " + minDiff);
    }
}