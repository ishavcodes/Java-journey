// code for Sum of Range function using Functions ---------------------------

import java.util.*;

public class SumOfRange{
    public static int sumRange(int arr[], int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter start index : ");
        int start = sc.nextInt();

        System.out.print("Enter end index : ");
        int end = sc.nextInt();

        int ans = sumRange(arr, start, end);

        System.out.println("Sum of array is : " + ans);
    }
}