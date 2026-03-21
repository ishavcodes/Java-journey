// Check if number contains a zero but not at the start --------------------

import java.util.*;
public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number as string: ");
        String s = sc.next();
        if(s.charAt(0) == '0') {
            System.out.println("Not a Duck Number");
        } else {
            if(s.contains("0")) System.out.println("Duck Number");
            else System.out.println("Not a Duck Number");
        }
    }
}