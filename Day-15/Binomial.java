// code for Binomial Coefficient using Functions -------------------------

import java.util.*;

public class Binomial{

    public static int fact(int n){
        int fact = 1;
        for(int i = n; i > 0; i--){
            fact = fact * i;
        }
        return fact;
    }

    public static int bino(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);
        int bino = n_fact/(r_fact * nmr_fact);
        return bino;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        int bino = bino(n,r);
        System.out.println("Binomial Coefficient of " + n + " & " + r  + " is : " + bino);
    }
}