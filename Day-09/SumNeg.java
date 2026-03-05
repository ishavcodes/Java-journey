// code for Sum until Negative Number ------------------

import java.util.*;

public class SumNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter number (Negative to stop): ");
            int n = sc.nextInt();
            if (n < 0) break;
            sum += n;
        }
        System.out.println("Total Sum: " + sum);
    }
}