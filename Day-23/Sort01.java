// Put all 0s first and then all 1s (Dutch Flag Lite) ------------------------

import java.util.*;

public class Sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count0 = 0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0) count0++;
        }
        for(int i=0; i<n; i++) {
            if(i < count0) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}