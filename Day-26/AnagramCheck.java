// Check if two strings are Anagrams (Ex: "listen", "silent") -----------------------

import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.next().toLowerCase().toCharArray();
        char[] s2 = sc.next().toLowerCase().toCharArray();
        Arrays.sort(s1); Arrays.sort(s2);
        if(Arrays.equals(s1, s2)) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}