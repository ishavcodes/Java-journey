// code for Average of Three using Functions -------------------------

import java.util.*;

public class Average{
    public static float avg(int a, int b, int c){
        float avg = (a + b + c)/3f;
        return avg;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        float avg = avg(a,b,c);
        System.out.printf("Average of " + a + ", " + b + " & " + c + " is : %.2f" ,avg );
    }
}