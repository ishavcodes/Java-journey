// Express even number as sum of two prime numbers ------------------------

import java.util.*;
public class GoldbachConjecture {
    public static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2; i*i<=n; i++) if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 != 0 || n <= 2) return;
        for(int i=2; i<=n/2; i++) {
            if(isPrime(i) && isPrime(n-i)) System.out.println(n + " = " + i + " + " + (n-i));
        }
    }
}