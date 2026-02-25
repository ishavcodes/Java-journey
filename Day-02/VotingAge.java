// Java Program to Check Voting Eligibility ---------------

import java.util.*;

public class VotingAge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You're eligible to vote.");
        }
        else{
            System.out.println("You're not eligible to vote.");
        }
    }
}