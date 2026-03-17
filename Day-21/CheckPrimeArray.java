// Code to Count Prime numbers in array ---------------------------

import java.util.*;

public class CheckPrimeArray{

    public static int getPrimeCount(int arr[]){
        int PrimeCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= 1){

            }
            for(int j = 2; j <= (int)Math.sqrt(arr[i]) ; j++){
                PrimeCount++;
            }
        }
        return PrimeCount;
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

        int ans = getPrimeCount(arr);

        System.out.println("Total Prime Numbers : " + ans);
    }
}