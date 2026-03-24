// Validate username (Length 8-15, must have underscore) -------------------------

import java.util.*;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        if(user.length() >= 8 && user.length() <= 15 && user.contains("_"))
            System.out.println("Valid Username");
        else
            System.out.println("Invalid Username");
    }
}