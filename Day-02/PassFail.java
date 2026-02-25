// Java Program to Check Pass or Fail Status -----------------------------------

import java.util.*;

public class PassFail{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        if(marks >= 33){
            System.out.println("Result : Pass");
        }
        else{
            System.out.println("Result : Fail");
        }
    }
}