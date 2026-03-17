// Code to Shift elements right by one ---------------------------

import java.util.*;

public class RotateArrayOnce{

    public static int[] rotateArray(int arr[]){
        int last = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
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

        int ans[] = rotateArray(arr);

        System.out.println("After Shifting : " + Arrays.toString(ans));
    }
}