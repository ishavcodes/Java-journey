// sum of factorial of digits == number (Ex: 145 -> 1!+4!+5!) -----------------

import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;
        while(temp > 0) {
            int d = temp % 10, f = 1;
            for(int i=1; i<=d; i++) f *= i;
            sum += f;
            temp /= 10;
        }
        if(sum == n) System.out.println("Strong Number");
        else System.out.println("Not Strong");
    }
}