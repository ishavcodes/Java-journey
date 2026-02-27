// Java Program to check exam eligibility based on attendance -----------------------------------

import java.util.*;

public class Attend{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your attendance in percentage : ");
        int attend = sc.nextInt();
        if(attend >= 75){
            System.out.println("Allowed for Exam.");
        }
        else{
            System.out.println("Shortage of attendance! Not Allowed.");
        }
    }
}