// Replace all vowels with the next consonant ---------------------------

import java.util.*;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), res = "";
        String vowels = "aeiouAEIOU";
        for(char ch : s.toCharArray()) {
            if(vowels.indexOf(ch) != -1) res += (char)(ch + 1);
            else res += ch;
        }
        System.out.println("Result: " + res);
    }
}