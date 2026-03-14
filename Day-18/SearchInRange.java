// code for Linear Search in a specific Range ---------------------------

import java.util.*;

public class SearchInRange{

    public static int getIndex(int arr[], int key, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
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

        System.out.print("Enter key : ");
        int key = sc.nextInt();

        System.out.print("Enter start : ");
        int start = sc.nextInt();

        System.out.print("Enter end : ");
        int end = sc.nextInt();

        int ans = getIndex(arr, key, start, end);

        if(ans == -1){
            System.out.println("Not Found.");
        }else{
            System.out.println("Element found at index : " + ans);
        }
    }
}