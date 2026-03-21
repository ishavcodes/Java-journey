// Ratio of sum of divisors to the number is same for both---------------------

import java.util.*;
public class FriendlyPair {
    public static int sumDiv(int n) {
        int s = 0;
        for(int i=1; i<=n; i++) if(n % i == 0) s += i;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        if(sumDiv(n1)/n1 == sumDiv(n2)/n2) System.out.println("Friendly Pair");
        else System.out.println("Not Friendly Pair");
    }
}