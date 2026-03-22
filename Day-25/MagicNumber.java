// Recursive sum of digits is 1 (Ex: 19 -> 1+9=10 -> 1+0=1) ------------------

import java.util.*;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        while(sum > 9) {
            int temp = sum, s = 0;
            while(temp > 0) { s += temp % 10; temp /= 10; }
            sum = s;
        }
        if(sum == 1) System.out.println("Magic Number");
        else System.out.println("Not Magic");
    }
}