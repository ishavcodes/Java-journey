// Sort characters of a string alphabetically------------------------

import java.util.*;

public class SortCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        Arrays.sort(arr);
        System.out.println("Sorted String: " + new String(arr));
    }
}