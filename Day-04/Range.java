// Java Program to check if a number is between 10 and 50 ------------------------------

import java.util.*;

public class Range{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num >= 10 && num <= 50 ){
            System.out.println("In range.");
        }
        else{
            System.out.println("Out of range.");
        }
    }
}