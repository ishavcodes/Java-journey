// code for Factorial of N -------------------

import java.util.*;

public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        int fact = 1;
        while(n >= 1){
            fact = fact * n;
            n--;

        }
        System.out.println("Factorial of " + temp + " is : " + fact);

    }
}