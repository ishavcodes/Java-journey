// Java Program to check if a number is divisible by both 5 and 11 -----------------------------------

import java.util.*;

public class Divisible{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num % 5 == 0 && num % 11 == 0){
            System.out.println("Divisible.");
        }
        else{
            System.out.println("Not Divisible.");
        }
    }
}