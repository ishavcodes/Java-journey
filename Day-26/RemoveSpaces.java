// Remove all white spaces from a string without replace() -----------------------

import java.util.*;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), res = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ' ') res += s.charAt(i);
        }
        System.out.println("Result: " + res);
    }
}