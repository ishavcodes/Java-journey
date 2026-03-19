// Find the maximum product of two integers in array ------------------------

import java.util.*;

public class MaxProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max2 = x;
            }
        }
        System.out.println("Max Product: " + (max1 * max2) + " (Pair: " + max1 + "," + max2 + ")");
    }
}