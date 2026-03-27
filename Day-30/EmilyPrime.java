// Number and its reverse are both Prime (Ex: 13 & 31) --------------------------

import java.util.*;

public class EmilyPrime {
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int temp = n, rev = 0;
        
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        
        if (n != rev && isPrime(n) && isPrime(rev)) {
            System.out.println(n + " is an Emily Prime (Emirp)!");
        } else {
            System.out.println(n + " is NOT an Emily Prime.");
        }
    }
}