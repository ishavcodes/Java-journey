// code for Binary Search with Comparison Count ---------------------------

import java.util.*;

public class BinarySearchCount{

    public static int getCount(int arr[], int key, int size){
        int count = 0;
        int start = 0;
        int end = size - 1;
        while(start <= end){
            int mid = (start + end)/2;
            count++;
            if(arr[mid] == key){
                System.out.println("Total comparison made : " + count);
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

        int ans = getCount(arr, key, size);

        if(ans == -1){
            System.out.println("Not Found.");
        }else{
            System.out.println("Element found at index : " + ans);
        }
    }
}