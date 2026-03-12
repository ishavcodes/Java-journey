// code for Sum of all numbers in Range using Functions ---------------------------

import java.util.*;

public class RangeSum{
    public static int rangeSum(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number : ");
        int start = sc.nextInt();
        System.out.print("Enter end number : ");
        int end = sc.nextInt();
        int sum = rangeSum(start, end); 
        System.out.println("Sum of all numbers from " + start + " to " + end + " is : " + sum);

    }
}