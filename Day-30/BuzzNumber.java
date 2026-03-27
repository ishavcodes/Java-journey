// Number ends with 7 or is divisible by 7 ------------------------

import java.util.*;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 10 == 7 || n % 7 == 0) System.out.println("Buzz Number");
        else System.out.println("Not Buzz");
    }
}