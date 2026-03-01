// Java Program to check Voting Eligibility using Ternary -------------------------


import java.util.*;

public class Vote{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        String result = (age >= 18)?"Eligible":"Not Eligible";
        System.out.println("You are " + result +".");
    }
}