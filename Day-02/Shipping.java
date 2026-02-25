// Java Program for Shipping Charges Calculation ---------------------

import java.util.*;

public class Shipping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bill amount : ");
        int bill = sc.nextInt();
        if(bill < 500){
            int TotalBill = bill + 40; 
            System.out.println("Total Bill is : " + TotalBill);
        }
        else{
            System.out.println("Total Bill is : " + bill);
        }
    }
}