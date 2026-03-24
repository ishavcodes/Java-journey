// Calculate sum of all digits present in a string -----------------------

import java.util.*;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) sum += Character.getNumericValue(ch);
        }
        System.out.println("Sum of digits: " + sum);
    }
}