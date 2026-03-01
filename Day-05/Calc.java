// Java Program to create a Basic Calculator using Switch --------------------------------

import java.util.*;

public class Calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator : ");
        char oper = sc.next().charAt(0);
        switch(oper){
            case '+' : System.out.println("Sum of " + num1 + " & " + num2 + " is " + (num1 + num2));
                       break;
            case '-' : System.out.println("Subtract of " + num1 + " & " + num2 + " is " + (num1 - num2));
                       break;
            case '*' : System.out.println("Product of " + num1 + " & " + num2 + " is " + (num1 * num2));
                       break;
            case '/' : System.out.println("Quotient of " + num1 + " & " + num2 + " is " + (num1 / num2));
                       break;
            case '%' : System.out.println("Remainder of " + num1 + " & " + num2 + " is " + (num1 % num2));
                       break;
            default : System.out.println("Wrong Operator.");
        }
    }
}