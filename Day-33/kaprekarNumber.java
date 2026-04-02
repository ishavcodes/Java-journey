// Square split in two parts sums to original --------------------------------

import java.util.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sq = (long) n * n;
        String s = String.valueOf(sq);
        int mid = s.length() / 2;
        int left = mid == 0 ? 0 : Integer.parseInt(s.substring(0, mid));
        int right = Integer.parseInt(s.substring(mid));
        System.out.println(left + right == n ? "Kaprekar Number." : "Not Kaprekar Number.");
    }
}