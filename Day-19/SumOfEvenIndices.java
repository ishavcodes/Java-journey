// code for Sum of elements at Even Indices ---------------------------

import java.util.*;

public class SumOfEvenIndices{

    public static int evenSum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i += 2){
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

        int ans = evenSum(arr);

        System.out.println("Sum of even index elements : " + ans);
    }
}