// Java Program for College Admission (Marks > 60 OR Quota) ----------------------------

import java.util.*;

public class Admission{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        System.out.print("Enter quota (1 for Yes, 0 for No) : ");
        int quota = sc.nextInt();
        if(marks > 60 || quota == 1){
            System.out.println("Admission Granted.");
        }
        else{
            System.out.println("Admission Denied.");
        }
    }
}