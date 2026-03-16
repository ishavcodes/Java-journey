// code for Check if Array is Palindrome ---------------------------

import java.util.*;

public class ArrayPalindrome{

    public static boolean isPalindrome(int arr[]){
        for(int i = 0; i < arr.length/2; i++){
            if(arr[i] != arr[arr.length - 1 - i]){
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

        boolean ans = isPalindrome(arr);

        if(ans == true){
            System.out.println("It is Palindrome Array.");
        }else{
            System.out.println("It is not Palindrome Array.");
        }
    }
}