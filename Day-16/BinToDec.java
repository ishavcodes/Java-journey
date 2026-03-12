// code for Binary to Decimal using Functions ---------------------------

import java.util.*;


public class BinToDec{

    public static int decNum(int n){
        int pow = 0;
        int sum = 0;
        while(n > 0){
            int ld = n % 10;
            sum = sum + (ld * (int)Math.pow(2, pow));
            pow++;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int DecNum = decNum(num);
        System.out.println("Decimal number of " + num + " is : " + DecNum);

    }
}