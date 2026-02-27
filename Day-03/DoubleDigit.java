// Java Program to check if a number is a 2-digit number -----------------------------------

import java.util.*;

public class DoubleDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if(num > 9 && num < 100){
            System.out.println(num + " is a 2-digit number.");
        }
        else{
            System.out.println(num + " is not a 2-digit number.");
        }
    }
}