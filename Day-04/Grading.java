// Java Program for Student Grading System -------------------------------------

import java.util.*;

public class Grading{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        if(marks > 80){
            System.out.println("Grade A.");
        }
        else if(marks > 60){
            System.out.println("Grade B.");
        }
        else{
            System.out.println("Grade C.");
        }
    }
}