// Find the character that appears maximum times --------------------------

import java.util.*;

public class MaxFrequencyChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[256];
        for(char ch : s.toCharArray()) freq[ch]++;
        char maxChar = ' ';
        int max = -1;
        for(int i=0; i<s.length(); i++) {
            if(max < freq[s.charAt(i)]) {
                max = freq[s.charAt(i)];
                maxChar = s.charAt(i);
            }
        }
        System.out.println("Max Frequency Char: " + maxChar);
    }
}