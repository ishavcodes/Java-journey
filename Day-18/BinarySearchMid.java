// code for Print Mid at every step of BS ---------------------------

import java.util.*;

public class BinarySearchMid{

    public static int getIndex(int arr[], int key, int size){
        int start = 0;
        int end = size - 1;
        while(start <= end){
            int mid = (start + end)/2;
            System.out.println("Current Mid : " + mid + " (Value : " + arr[mid] + ")");
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key ){
                start = mid + 1;
            }
            if(arr[mid] > key){
                end = mid - 1;
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

        System.out.print("Enter a key : ");
        int key = sc.nextInt();

        int ans = getIndex(arr, key, size);

        if(ans == -1){
            System.out.println("Not Found.");
        }else{
            System.out.println("Element found at index : " + ans);
        }
    }
}