// code for Greatest Common Divisor using Functions ------------------------------

import java.util.*;

public class GCD{
    public static int isGCD(int a, int b){
        int gcd = 1;
        int min = 0;
        if(a < b){
            min = a;
        }else{
            min = b;
        }
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int ans = isGCD(a,b);
        System.out.println("GCD of " + a + " & " + b + " is : " + ans);
    }
}