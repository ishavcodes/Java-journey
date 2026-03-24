// Find the longest word in a sentence ------------------------

import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String longest = "";
        for(String w : words) {
            if(w.length() > longest.length()) longest = w;
        }
        System.out.println("Longest Word: " + longest);
    }
}