// sum of digits == sum of digits of its prime factors -------------------

import java.util.*;
public class SmithNumber {
    public static int sumDigits(int n) {
        int s = 0;
        while(n > 0) { s += n % 10; n /= 10; }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumDigitsN = sumDigits(n), sumFactors = 0, temp = n;
        for(int i=2; i<=temp; i++) {
            while(temp % i == 0) {
                sumFactors += sumDigits(i);
                temp /= i;
            }
        }
        if(sumDigitsN == sumFactors) System.out.println("Smith Number");
        else System.out.println("Not Smith");
    }
}