// Java Program to check if a shape is a Square or Rectangle -------------------------------------

import java.util.*;

public class Square{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int l = sc.nextInt();
        System.out.print("Enter breadth : ");
        int b = sc.nextInt();
        if(l == b){
            System.out.println("It's a square.");
        }
        else{
            System.out.println("It's a rectangle.");
        }
    }
}
