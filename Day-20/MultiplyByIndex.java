// code for Multiply element by its Index ---------------------------

import java.util.*;

public class MultiplyByIndex{

    public static int[] multiplyByIndex(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * i;
        }
        return arr;
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

        int ans[] = multiplyByIndex(arr);

        System.out.println("Updated Array : " + Arrays.toString(ans));
    }
}