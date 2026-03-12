// code for Power (a^b) without Math.pow using Functions ---------------------------------

import java.util.*;

public class Power{
    public static int powEx(int b, int p){
        int result = 1;
        for(int i = 1; i <= p; i++){
            result *= b;
        }
        return result;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter power : ");
        int pow = sc.nextInt();
        int ans = powEx(base, pow);
        System.out.println("Ans is : " + ans);
    }
}