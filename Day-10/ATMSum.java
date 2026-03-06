// code for ATM style Sum with Exit 0 --------------------

import java.util.*;

public class ATMSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        do{
            System.out.print("Enter amount (0 to Finish): ");
            int amount = sc.nextInt();
            if(amount == 0) break;
            sum += amount;
        }while(true);
        System.out.println("Total Balance: " + sum);
    }
}