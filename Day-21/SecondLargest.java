// Code to Find the Second Largest element ---------------------------

import java.util.*;

public class SecondLargest{

    public static int secondMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max2 = max;
                max = arr[i];
            }else if(max > arr[i] && arr[i] > max2){
                max2 = arr[i];
            }
        }
        return max2;
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

        int ans = secondMax(arr);

        System.out.println("Second Largest : " + ans);
    }
}