// Recursive sum of digits is 1 -----------------------------

import java.util.*;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n % 9 == 1 ? "Magic Number." : "Not Magic Number.");
    }
}