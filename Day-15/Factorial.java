// code for Factorial using Functions --------------------------------

import java.util.*;

public class Factorial{

    public static int fact(int n){
        int fact = 1;
        for(int i = n; i > 0; i--){
            fact = fact * i;
        }
        return fact;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println("Factorial of " + n + " is : " + fact);
    }
}