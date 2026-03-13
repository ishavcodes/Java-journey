// code for Search Element using Linear Search ---------------------------

import java.util.*;

public class LinearSearch{
    public static int find(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
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

        System.out.println("Enter array numbers : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter key : ");
        int key = sc.nextInt();

        int ans = find(arr, key);

        if(ans == -1){
            System.out.println("Element not found (" + ans +")");
        }else{
            System.out.println("Element found at index : " + ans);
        }

    }
}