// Check if string contains all alphabets from A-Z ------------------------

import java.util.*;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        boolean[] mark = new boolean[26];
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') mark[s.charAt(i) - 'a'] = true;
        }
        for(boolean b : mark) if(!b) { System.out.println("Not Pangram"); return; }
        System.out.println("Pangram");
    }
}