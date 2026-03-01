// Java Program to check Odd/Even using Ternary Operator ----------------------------------

import java.util.*;

public class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        String ans = (n % 2 == 0)?"even":"odd";
        System.out.println(n + " is " + ans + " number.");
    }
}