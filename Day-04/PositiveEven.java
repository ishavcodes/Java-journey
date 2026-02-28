// Java Program to check if a number is both Positive and Even --------------------------------

import java.util.*;

public class PositiveEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num > 0 && num % 2 == 0){
            System.out.println("Positive Even.");
        }
        else{
            System.out.println("Not.");
        }
    }
}