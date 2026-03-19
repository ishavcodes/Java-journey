// Basic: Find max element to left and right of each --------------------

import java.util.*;

public class RainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        for(int i=1; i<n-1; i++) {
            int leftMax = arr[i], rightMax = arr[i];
            for(int j=0; j<i; j++) leftMax = Math.max(leftMax, arr[j]);
            for(int j=i+1; j<n; j++) rightMax = Math.max(rightMax, arr[j]);
            
            System.out.println("At index " + i + ": LeftMax=" + leftMax + ", RightMax=" + rightMax);
        }
    }
}