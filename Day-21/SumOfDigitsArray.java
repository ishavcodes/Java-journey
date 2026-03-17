// Code to Sum digits of each element ---------------------------

import java.util.*;

public class SumOfDigitsArray{

    public static void digitSum(int arr[]){
        
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            int temp = arr[i];
            while(temp > 0){
                sum = sum + (temp % 10);
                temp /= 10;
            }
            System.out.print(sum + " ");
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

        digitSum(arr);
    }
}