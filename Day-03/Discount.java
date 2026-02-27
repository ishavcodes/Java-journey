// Java Program to calculate flat discount on bill amount -------------------------------

import java.util.*;

public class Discount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bill : ");
        int bill = sc.nextInt();
        if(bill > 1000){
            int newBill = bill - 100;
            System.out.println("Total bill is Rs." + newBill);
        }
        else{
            System.out.println("Total bill is Rs." + bill);
        }
    }
}
