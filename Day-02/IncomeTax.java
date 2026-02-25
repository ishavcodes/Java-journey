// Java Program to Calculate Income Tax Using User Input and If-Else ------------------------------------------------

import java.util.*;

public class IncomeTax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income >= 1000000){
            float tax = 0.30f * income;
            System.out.println("Your tax amount is " + tax);
        }
        else if(500000 < income && income < 1000000){
            float tax = 0.20f * income;
            System.out.println("Your tax amount is " + tax);
        }
        else{
            System.out.println("Your tax amount is 0");
        }
    }
}