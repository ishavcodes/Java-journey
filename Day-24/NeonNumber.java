// sum of digits of its square is equal to number (Ex: 9 -> 81 -> 8+1=9) --------------------

import java.util.*;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n, sum = 0;
        while(sq > 0) {
            sum += (sq % 10);
            sq /= 10;
        }
        if(sum == n) System.out.println("Neon Number");
        else System.out.println("Not Neon");
    }
}