// Java Program to check driving license eligibility ----------------------------------------------------

import java.util.*;

public class Driving{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter test (1 for pass, 0 for Not pass) : ");
        int test = sc.nextInt();
        if(age >= 18 && test == 1){
            System.out.println("License Granted.");
        }
        else{
            System.out.println("License not Granted.");
        }
    }
}