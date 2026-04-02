// Sum of squares of digits eventually becomes 1 ----------------------

import java.util.*;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = n;
        while(res != 1 && res != 4) {
            int sum = 0;
            while(res > 0) {
                int d = res % 10;
                sum += (d * d);
                res /= 10;
            }
            res = sum;
        }
        System.out.println(res == 1 ? "Happy Number." : "Not Happy Number.");
    }
}