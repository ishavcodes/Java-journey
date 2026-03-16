// code for Print Array in Reverse ---------------------------

import java.util.*;

public class PrintReverse{

    public static int[] reverseArray(int arr[], int size){
        int arr2[] = new int[size];
        int j = 0;
        for(int i = arr.length-1; i >= 0; i--){
            arr2[j] = arr[i];
            j++;
        }
        return arr2;
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

        System.out.println("Original Array : " + Arrays.toString(arr));

        int ans[] = reverseArray(arr, size);

        System.out.println("Updated Array : " + Arrays.toString(ans));
    }
}