// Check if a string is palindrome (Ex: "madam") ----------------------------

import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), rev = "";
        for(int i = s.length()-1; i >= 0; i--) rev += s.charAt(i);
        if(s.equalsIgnoreCase(rev)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}