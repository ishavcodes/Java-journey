// Check if one string is a subsequence of another -------------------------

import java.util.*;

public class SubsequenceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), sub = sc.next();
        int i=0, j=0;
        while(i < s.length() && j < sub.length()) {
            if(s.charAt(i) == sub.charAt(j)) j++;
            i++;
        }
        if(j == sub.length()) System.out.println("Is Subsequence");
        else System.out.println("Not Subsequence");
    }
}