// code for Replace element with its Square ---------------------------

import java.util.*;

public class ReplaceWithSquare{

    public static int[] replaceWithSquare(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
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

        int ans[] = replaceWithSquare(arr);

        System.out.println("Updated Array : " + Arrays.toString(ans));
    }
}