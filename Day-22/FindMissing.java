// Find the missing number in a range 1 to N ---------------------------

import java.util.*;

public class FindMissing{

    public static int findMissing(int arr[], int size){
        int totalSum = ((size) * (size + 1)/2);
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        int MissingNum = totalSum - sum;
        return MissingNum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N (Actual range 1 to N): ");
        int n = sc.nextInt();

        
        int arr[] = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " elements (1 to " + n + " ke beech): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findMissing(arr, n);
        System.out.println("Missing number is : " + ans);
    }
}