// code for Fibonacci Series using For Loop ------------------

import java.util.*;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 0;
        System.out.print(a + " ");
        int b = 1;
        System.out.print(b + " ");
        for(int i = 1; i <= n-2 ; i++){
            int num = a + b;
            System.out.print(num + " ");
            a = b;
            b = num;
        }
    }
}