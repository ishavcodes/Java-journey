// String containing all letters A-Z --------------------------------

import java.util.*;

public class PangramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        boolean allFound = true;
        for(char c = 'a'; c <= 'z'; c++) {
            if(!s.contains(String.valueOf(c))) {
                allFound = false; break;
            }
        }
        System.out.println(allFound ? "Pangram." : "Not Pangram.");
    }
}