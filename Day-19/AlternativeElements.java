// code for Alternative Elements in Array ---------------------------

import java.util.*;

public class AlternativeElements{
    public static void altElement(int arr[]){
        for(int i = 0; i < arr.length; i += 2){
            System.out.print(arr[i] + " ");
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

        altElement(arr);
    }
}