// code for Difference between Max and Min ---------------------------

import java.util.*;

public class DifferenceMaxMin{
    public static int getDifference(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int diff = max - min;
        return diff;
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

        int ans = getDifference(arr);

        System.out.println("Difference between Max and Min is : " + ans);
    }
}