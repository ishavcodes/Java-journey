// sum of digits == product of digits (Ex: 1124 -> 1+1+2+4 = 1*1*2*4) --------------------

import java.util.*;
public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, prod = 1, d;
        while(n > 0) {
            d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        if(sum == prod) System.out.println("Spy Number");
        else System.out.println("Not Spy");
    }
}