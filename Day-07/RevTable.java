// code for Reverse Table using For Loop ------------------

import java.util.*;

public class RevTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        for(int i = 10; i >= 1; i--){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}