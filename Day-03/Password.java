// Java Program for a simple numeric password access system ------------------------------------

import java.util.*;

public class Password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password : ");
        int pass = sc.nextInt();
        if(pass == 1234){
            System.out.println("Access granted.");
        }
        else{
            System.out.println("Access denied.");
        }
    }
}