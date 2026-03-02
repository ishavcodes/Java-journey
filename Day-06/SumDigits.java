// code for Sum of digits of N ------------------

import java.util.*;

public class SumDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0){
            int last_digit = n % 10;
            sum = sum + last_digit;
            n /= 10;
        }
        System.out.println(sum);
    }
}