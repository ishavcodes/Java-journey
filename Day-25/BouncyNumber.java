// Digits are neither increasing nor decreasing ----------------------

import java.util.*;
public class BouncyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        boolean inc = false, dec = false;
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) < s.charAt(i+1)) inc = true;
            if(s.charAt(i) > s.charAt(i+1)) dec = true;
        }
        if(inc && dec) System.out.println("Bouncy Number");
        else System.out.println("Not Bouncy");
    }
}