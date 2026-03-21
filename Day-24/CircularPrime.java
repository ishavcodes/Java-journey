// Prime even after rotating its digits (Ex: 113, 131, 311) ----------------

import java.util.*;
public class CircularPrime {
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i=2; i*i<=n; i++) if(n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean flag = true;
        for(int i=0; i<n; i++) {
            if(!isPrime(Integer.parseInt(s))) { flag = false; break; }
            s = s.substring(1) + s.charAt(0); 
        }
        if(flag) System.out.println("Circular Prime");
        else System.out.println("Not Circular Prime");
    }
}