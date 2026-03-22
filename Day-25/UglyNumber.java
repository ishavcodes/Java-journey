// Number whose prime factors are only 2, 3, or 5 --------------------

import java.util.*;
public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int[] factors = {2, 3, 5};
        for(int f : factors) while(temp % f == 0) temp /= f;
        if(temp == 1) System.out.println("Ugly Number");
        else System.out.println("Not Ugly");
    }
}