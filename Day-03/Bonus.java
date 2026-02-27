// Java Program to calculate employee bonus based on salary ---------------------------------

import java.util.*;

public class Bonus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary : ");
        int sal = sc.nextInt();
        if(sal >= 5000){
            int newSal = sal + 500;
            System.out.println("Salary is : " + newSal);
        }
        else{
            System.out.println("Salary is : " + sal);
        }
    }
}