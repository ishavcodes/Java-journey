// code for Reverse Array using Swap Function ---------------------------

import java.util.*;

public class ReverseArray{
    public static int[] reverseArray(int arr[],int size){
        int start = 0;
        int end = size - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size +  " elements of an array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int rev[] = reverseArray(arr, size);

        System.out.println("Reversed array : " );
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}