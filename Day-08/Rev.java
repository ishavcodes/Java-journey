// code for Reverse Number using Do-While Loop -------------------------

import java.util.*;

public class Rev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int n = sc.nextInt();
        int rev = 0;
        do{
            int last_digit = n%10;
            rev = (rev * 10) + last_digit;
            n = n/10;
        }while(n > 0);
        System.out.print(rev);
    }
}