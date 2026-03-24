// Check if two strings are permutations of each other--------------------------

import java.util.*;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c1 = sc.next().toCharArray();
        char[] c2 = sc.next().toCharArray();
        Arrays.sort(c1); Arrays.sort(c2);
        if(Arrays.equals(c1, c2)) System.out.println("Permutation of each other");
        else System.out.println("Not a permutation");
    }
}