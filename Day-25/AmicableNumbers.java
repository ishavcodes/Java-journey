// sum of divisors of each is equal to the other number ------------------------

import java.util.*;
public class AmicableNumbers {
    public static int divSum(int n) {
        int s = 0;
        for(int i=1; i<n; i++) if(n % i == 0) s += i;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        if(divSum(n1) == n2 && divSum(n2) == n1) System.out.println("Amicable Pair");
        else System.out.println("Not Amicable");
    }
}