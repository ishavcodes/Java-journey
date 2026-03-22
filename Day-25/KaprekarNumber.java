// square split into two parts which sum to original number ----------------------

import java.util.*;
public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sq = (long)n * n;
        String s = Long.toString(sq);
        int len = s.length();
        for(int i=1; i<len; i++) {
            int p1 = Integer.parseInt(s.substring(0, i));
            int p2 = Integer.parseInt(s.substring(i));
            if(p2 > 0 && p1 + p2 == n) {
                System.out.println("Kaprekar Number");
                return;
            }
        }
        System.out.println("Not Kaprekar");
    }
}