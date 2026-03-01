// Java Program to print Gender description using Switch ---------------------

import java.util.*;

public class Gender{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you're gender('M' for Male, 'F' for Female, 'T' for Trans) : ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'M' : System.out.println("Male.");
                       break;
            case 'F' : System.out.println("Female.");
                       break;
            case 'T' : System.out.println("Transgender.");
                       break;
            default : System.out.println("Unknown.");
        }
    }
}