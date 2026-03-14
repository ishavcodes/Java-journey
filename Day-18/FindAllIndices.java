// code for Find All Indices of a Key ---------------------------

import java.util.*;

public class FindAllIndices{

    public static void getIndices(int arr[], int key){
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("Element found at index : " + i);
                found = true;
            }
        }
        if(!found){
            System.out.println("Element not present.");
        }

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

        getIndices(arr, key);
    }
}