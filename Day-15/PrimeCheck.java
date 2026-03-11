// code for Basic Prime Check using Functions ---------------------

import java.util.*;

public class PrimeCheck{

    public static boolean isPrime(int n){
        if( n == 2){
            return true;
        }
        for(int i = 2; i < n; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean PrimeCheck = isPrime(n);
        System.out.println(PrimeCheck);
    }
}