// Find the first non-repeating character in a string -----------------------

import java.util.*;

public class FirstUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0; i<s.length(); i++) {
            boolean unique = true;
            for(int j=0; j<s.length(); j++) {
                if(i != j && s.charAt(i) == s.charAt(j)) { unique = false; break; }
            }
            if(unique) { System.out.println("First Unique: " + s.charAt(i)); return; }
        }
    }
}