// code for Password Check using Break ------------------

import java.util.*;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPass = 1234;
        for (int i = 1; i <= 3; i++) { // 3 Tries
            System.out.print("Enter Password: ");
            int attempt = sc.nextInt();
            if (attempt == correctPass) {
                System.out.println("Login Successful!");
                break;
            } else {
                System.out.println("Wrong! Attempt " + i + " used.");
            }
        }
    }
}