// Java Program to find Max of two numbers using Ternary ------------------------------

import java.util.*;

public class Max{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int max = (a>b)?a:b;
        System.out.println("Max of " + a + " & " + b + " is " + max);
    }
}