// P(n) = P(n-2) + P(n-3) Sequence ------------------------

import java.util.*;

public class PerrinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        long p0 = 3, p1 = 0, p2 = 2;
        System.out.print(p0 + " " + p1 + " " + p2 + " ");
        for(int i = 3; i < terms; i++) {
            long pNext = p0 + p1;
            System.out.print(pNext + " ");
            p0 = p1; p1 = p2; p2 = pNext;
        }
    }
}