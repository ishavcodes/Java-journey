// code for Sum of Digits using Functions ---------------------

import java.util.*;

public class DigitSum{
    public static int sum(int n){
        int sum = 0;
        while(n > 0){
            int ld = n % 10;
            sum = sum + ld;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits : ");
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.println("Sum of digits " + n + " is : " + sum);
    }
}