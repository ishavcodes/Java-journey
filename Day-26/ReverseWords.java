// Reverse each word in a sentence (Ex: "Hello Java" -> "olleH avaJ") -------------------------

import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for(String w : words) {
            String revW = "";
            for(int i=w.length()-1; i>=0; i--) revW += w.charAt(i);
            System.out.print(revW + " ");
        }
    }
}