// Code to Find unique elements in array ---------------------------

import java.util.*;

public class FindUnique{

    public static void isUnique(int arr[]){

        boolean isDuplicate = false;
        System.out.print("Unique Elements : " );
        for(int i = 0; i < arr.length; i++){
            isDuplicate = false;
            for(int j = 0; j < arr.length; j++){
                if( i != j && arr[i] == arr[j]){
                    isDuplicate = true;
                }
            }
            if(isDuplicate == false){
                System.out.print(arr[i] + " ");
            }
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

        isUnique(arr);
    }
}