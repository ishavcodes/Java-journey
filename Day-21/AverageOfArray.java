// Code to find Average of all elements ---------------------------

import java.util.*;

public class AverageOfArray{

    public static float getAverage(int arr[], int size){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        float avg = (float) sum / size;
        return avg;
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

        float ans = getAverage(arr, size);

        System.out.println("Average : " + ans);
    }
}