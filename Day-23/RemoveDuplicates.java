// Remove duplicates from a SORTED array ------------------------

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (Sorted Array): ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        if(n == 0) return;
        int j = 0; 
        for(int i=1; i<n; i++) {
            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.print("After removing duplicates: ");
        for(int k=0; k<=j; k++) System.out.print(arr[k] + " ");
    }
}