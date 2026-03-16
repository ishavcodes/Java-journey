// code for Sum of Squares of all elements ---------------------------

import java.util.*;

public class SumOfSquares{

    public static int getSum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + (arr[i] * arr[i]);
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

        int ans = getSum(arr);

        System.out.println("Sum of squares : " + ans );
    }
}