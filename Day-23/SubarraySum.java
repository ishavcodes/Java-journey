// Find a continuous subarray with a given target sum -------------------

import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter Target Sum: ");
        int target = sc.nextInt();

        int currentSum = 0, start = 0;
        for (int end = 0; end < n; end++) {
            currentSum += arr[end];
            while (currentSum > target && start < end) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == target) {
                System.out.println("Subarray found between index " + start + " and " + end);
                return;
            }
        }
        System.out.println("No subarray found.");
    }
}