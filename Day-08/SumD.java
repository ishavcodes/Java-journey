// code for Sum of Digits using Do-While Loop --------------

import java.util.*;

public class SumD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int n = sc.nextInt();
        int sum = 0;
        do{
            int last_digit = n%10;
            sum = sum + last_digit;
            n = n/10;
        }while(n > 0);
        System.out.println("Sum of digits : " + sum);
    }
}
