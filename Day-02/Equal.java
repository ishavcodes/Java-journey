// Java Program to Check if Two Numbers are Equal ------------------------------

import java.util.*;

public class Equal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        if(num1 == num2){
            System.out.println("Numbers are equal.");
        }
        else{
            System.out.println("Numbers are not equal.");
        }
    }
}