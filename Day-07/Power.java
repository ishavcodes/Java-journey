// code for Power of A^B using For Loop ------------------

import java.util.*;

public class Power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base : ");
        int b = sc.nextInt();
        System.out.print("Enter an exponent : ");
        int e = sc.nextInt();
        int ans = 1;
        for(int i = 1 ; i<= e ; i++ ){
            ans = ans * b;
        }
        System.out.println("Power of " + b + " is " + ans);
    }
}