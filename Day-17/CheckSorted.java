// code for Check Sorted Array using Functions ---------------------------

import java.util.*;

public class CheckSorted{
    public static boolean isSorted(int arr[]){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        
        return true;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        boolean ans = isSorted(arr);

        System.out.println("Array is sorted : " + ans);
    }
}