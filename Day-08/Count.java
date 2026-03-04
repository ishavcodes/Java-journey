// code for Count Digits using Do-While Loop ----------------------

import java.util.*;

public class Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int n = sc.nextInt();
        int dig = 0;
        do{
            int last_digit = n%10;
            dig = dig + 1;
            n = n/10;
        }while(n > 0);
        System.out.println("Digit is : " + dig);
    }
}