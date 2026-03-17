// Function to return smallest element ---------------------------

import java.util.*;

public class SmallestInFunction{

    public static int getSmallest(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
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

        int ans = getSmallest(arr);

        System.out.println("Smallest element is : " + ans);
    }
}