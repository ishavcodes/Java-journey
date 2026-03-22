// sum of digits raised to power of their position == number ---------------------

import java.util.*;
public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int len = s.length(), temp = n, sum = 0;
        while(temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, len--);
            temp /= 10;
        }
        if(sum == n) System.out.println("Disarium Number");
        else System.out.println("Not Disarium");
    }
}