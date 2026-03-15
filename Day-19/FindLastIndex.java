// code for Last Occurrence of an element ---------------------------

import java.util.*;

public class FindLastIndex{

    public static int lastIndex(int arr[], int key){
        for(int i = arr.length - 1; i > -1; i--){
            if(key == arr[i]){
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

        int ans = lastIndex(arr, key);

        if( ans == -1){
            System.out.println("Element Not Found.");
        }else{
            System.out.println("Last occurence of " + key + " is at index : " + ans);
        }
    }
}