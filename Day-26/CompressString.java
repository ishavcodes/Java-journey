// Basic compression (Ex: "aaabb" -> "a3b2") -----------------------------

import java.util.*;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), res = "";
        for(int i=0; i<s.length(); i++) {
            int count = 1;
            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
                count++; i++;
            }
            res += s.charAt(i) + "" + count;
        }
        System.out.println("Compressed: " + res);
    }
}