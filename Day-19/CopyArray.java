// code for Copy one array to another ---------------------------

import java.util.*;

public class CopyArray{

    public static void newArray(int arr[], int size){
        int arr2[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Copied Array : " + Arrays.toString(arr2));
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

        newArray(arr, size);
    }
}