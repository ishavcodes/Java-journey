// Convert Uppercase to Lowercase and vice versa ----------------------

import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) res += Character.toLowerCase(ch);
            else res += Character.toUpperCase(ch);
        }
        System.out.println("Toggled: " + res);
    }
}