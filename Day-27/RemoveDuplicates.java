// Remove duplicate characters from a string --------------------------

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), res = "";
        for(int i=0; i<s.length(); i++) {
            String ch = "" + s.charAt(i);
            if(!res.contains(ch)) res += ch;
        }
        System.out.println("Result: " + res);
    }
}