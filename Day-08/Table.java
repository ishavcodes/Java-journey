// code for Table of N using Do-While Loop --------------------------------

import java.util.*;

public class Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(n + " * " + i + " = " + (n*i));
            i++;
        }while(i <= 10);
    }
}