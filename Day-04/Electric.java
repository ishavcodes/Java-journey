// Java Program to calculate Electricity Bill based on units -----------------------------------

import java.util.*;

public class Electric{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your units consumed : ");
        int u = sc.nextInt();
        if(u > 100){
            int Bill = u * 5;
            System.out.println("Your bill is " + Bill +".");
        }
        else{
            System.out.println("No Bill.");
        }
    }
}