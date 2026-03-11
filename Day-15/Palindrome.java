// code for Palindrome Number using Functions---------------------------

import java.util.*;

public class Palindrome{

    public static boolean check(int n){
        int temp = n;
        int rev = 0;
        while(n > 0){
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n = n/10;
        }
        if(rev == temp){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean ans = check(n);
        if(ans == true){
            System.out.println(n + " is Palindrome.");
        }else{
            System.out.println(n + " is not Palindrome.");
        }
    }
}