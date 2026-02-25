// Java Program to Check if Number is Positive, Negative or Zero --------------------

import java.util.*;

public class PosNeg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println(num + " is positive.");
        }
        else if(num < 0){
            System.out.println(num + " is negative.");
        }
        else{
            System.out.println("Num is zero.");
        }
    }
}