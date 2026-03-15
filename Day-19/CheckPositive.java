// code for Check if all elements are Positive ---------------------------

import java.util.*;

public class CheckPositive{

    public static boolean isPositive(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                return false;
            }
        }
        return true;
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

        boolean ans = isPositive(arr);

        System.out.println("Are all elements positive? " + ans);
    }
}