// code for Swap First and Last element ---------------------------

import java.util.*;

public class SwapFirstLast{

    public static int[] swap(int arr[]){
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        return arr;
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

        System.out.println("Original Array : " + Arrays.toString(arr));

        int ans[] = swap(arr);

        System.out.println("Modified Array : " + Arrays.toString(ans));
    }
}