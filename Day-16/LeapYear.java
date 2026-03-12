// code for Leap Year Check using Functions -------------------

import java.util.*;

public class LeapYear{
    public static boolean isLeapYear(int n){
        if(n % 4 == 0 && n % 100 != 0){
            return true;
        }else if(n % 400 == 0){
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int n = sc.nextInt();
        boolean ans = isLeapYear(n);
        if (ans == true){
            System.out.print(n + " is leap year.");
        }else{
            System.out.print(n + " is not leap year.");
        }
        
    }
}