// Code to Count total Odd and Even numbers ---------------------------

import java.util.*;

public class OddEvenCount{

    public static void getCount(int arr[]){

        int EvenCount = 0;
        int OddCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                EvenCount++;
            }else{
                OddCount++;
            }
        }
        System.out.println("Even elements : " + EvenCount);
        System.out.println("Odd elements : " + OddCount);
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

        getCount(arr);
    }
}