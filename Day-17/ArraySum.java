// code for Sum of Array using Functions ---------------------------

import java.util.*;

public class ArraySum{
    public static int calculateSum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.print("Enter " + size + " elements : ");
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        int sum = calculateSum(numbers);
        System.out.println("Sum of array is : " + sum);
    }
}