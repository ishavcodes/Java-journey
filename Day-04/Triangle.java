// Java Program to check if a Triangle is valid based on angles -----------------------------------

import java.util.*;

public class Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first angle : ");
        int a1 = sc.nextInt();
        System.out.print("Enter second angle : ");
        int a2 = sc.nextInt();
        System.out.print("Enter third angle : ");
        int a3 = sc.nextInt();
        if((a1+a2+a3) == 180){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Not a valid triangle.");
        }
    }
}