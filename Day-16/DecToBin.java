// code for Decimal to Binary using Functions -------------------------

import java.util.*;

public class DecToBin{
    
    public static int decNum(int n){
        int pow = 0;
        int num = 0;
        while(n > 0){
            int rem = n % 2;
            num = num + (rem * (int)Math.pow(10,pow));
            pow++;
            n /= 2;
        }
        return num;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number : ");
        int n = sc.nextInt();
        int decNum = decNum(n);
        System.out.println("Decimal number of " + n + " is : " + decNum);
    }
}