// Prime factors are only 2, 3, or 5 -------------------------

import java.util.*;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int[] factors = {2, 3, 5};
        for(int f : factors) {
            while(temp % f == 0 && temp > 0) temp /= f;
        }
        System.out.println(temp == 1 ? "Ugly Number." : "Not Ugly Number.");
    }
}