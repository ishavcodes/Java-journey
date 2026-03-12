// code for Armstrong Number using Functions ------------------------

import java.util.*;

public class Armstrong{
    public static boolean isArmstrong(int n){
        int sum = 0;
        int temp = n;
        while(n > 0){
            int ld = n % 10;
            sum += ld * ld * ld;
            n /= 10;
        }
        if(sum == temp){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int n = sc.nextInt();
        boolean ans = isArmstrong(n);
        if(ans == true){
            System.out.println(n + " is armstrong number.");
        }else{
            System.out.println(n + " is not armstrong number.");
        }
    }
}