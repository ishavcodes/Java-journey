// Java Program to find the elder between two siblings ---------------------

import java.util.*;

public class Elder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first sibling age : ");
        int age1 = sc.nextInt();
        System.out.print("Enter second sibling age : ");
        int age2 = sc.nextInt();
        if(age1 > age2){
            System.out.println("First sibling is elder.");
        }
        else if(age2 > age1){
            System.out.println("Second sibling is elder.");
        }
        else{
            System.out.println("Both are of same age.");
        }
    }
}