// code for Factorial of N using Do-While Loop --------------------------------

import java.util.*;

public class Fact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        int fact = 1;
        do{
            fact = fact * n;
            n--;
        }while(n >= 1);
        System.out.println("Factorial of " + temp + " is " + fact);
    }
}