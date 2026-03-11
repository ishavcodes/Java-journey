// code for Prime in Range using Functions -------------------

import java.util.*;

public class PrimeRange{

    public static boolean isPrime(int n){
        if( n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeRange(int n){
        for(int i = 2; i <= n; i++){
            boolean check = isPrime(i);
            if(check == true){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int n = sc.nextInt();
        PrimeRange(n);
    }
}