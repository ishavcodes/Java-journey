// Sum of digits raised to power of their position ------------------------------

import java.util.*;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            sum += Math.pow(Character.getNumericValue(s.charAt(i)), i + 1);
        }
        System.out.println(sum == n ? "Disarium Number." : "Not Disarium Number.");
    }
}