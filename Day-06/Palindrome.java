// code for Palindrome Number --------------------------

import java.util.*;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(n > 0){
            rev = (rev * 10) + (n % 10);
            n /=10;
        }
        if(temp == rev){
            System.out.println("It's Palindrome.");
        }else{
            System.out.println("It's not Palindrome.");
        }
    }
}