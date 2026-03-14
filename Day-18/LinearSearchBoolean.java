// code for Linear Search returning Boolean ---------------------------

import java.util.*;

public class LinearSearchBoolean{

    public static boolean getIndex(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
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

        boolean ans = getIndex(arr, key);

        System.out.println("Is element present? " + ans);
    }
}