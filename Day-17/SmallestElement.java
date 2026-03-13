// code for Find Minimum using Linear Search ---------------------------

import java.util.*;

public class SmallestElement{
    public static int findSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
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

        int ans = findSmallest(arr);

        System.out.println("Smallest element of this array is : " + ans);
    }
}