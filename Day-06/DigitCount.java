// code for Digit Count in N --------------------

import java.util.*;

public class DigitCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int n = sc.nextInt();
        int dig = 0;
        while(n > 0){
            dig += 1;
            n /= 10;
        }
        System.out.println(dig + " digits.");
    }
}
