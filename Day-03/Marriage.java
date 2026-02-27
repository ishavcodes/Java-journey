// Java Program to check eligibility for marriage based on age --------------------------------

import java.util.*;

public class Marriage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age >= 21){
            System.out.println("You're eligible for marriage.");
        }
        else{
            System.out.println("You're not eligible for marriage.");
        }
    }
}