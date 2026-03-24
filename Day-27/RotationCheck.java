// Check if one string is a rotation of another (Ex: "ABCD", "CDAB") ----------------------

import java.util.*;

public class RotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        if(s1.length() == s2.length() && (s1 + s1).contains(s2))
            System.out.println("Yes, it is a rotation");
        else
            System.out.println("No rotation");
    }
}