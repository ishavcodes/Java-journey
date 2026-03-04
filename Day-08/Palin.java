// code for Palindrome Check using Do-While Loop ------------------------------

import java.util.*;

public class Palin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int n = sc.nextInt();
        int temp = n ;
        int rev = 0;
        do{
            int last_digit = n%10;
            rev = (rev * 10) + last_digit;
            n = n/10;
        }while(n > 0);
        if(rev == temp){
            System.out.println("It's Palindrome");
        }else{
            System.out.println("It's not Palindrome");
        }
    }
}