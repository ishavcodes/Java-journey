// Count total number of words without using split() -------------------------

import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        if(s.isEmpty()) { System.out.println("Words: 0"); return; }
        int count = 1;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') count++;
        }
        System.out.println("Total Words: " + count);
    }
}