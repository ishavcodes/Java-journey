// code for Digit Sum in Range ----------------


import java.util.*;

public class SumRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 10; i<=20; i++){
            int sum = 0;
            int temp = i;
            for(int j = 1; j <= 2; j++){
                int ld = temp % 10;
                sum = sum + ld;
                temp = temp / 10;
            }
            System.out.println("Sum of digits of " + i + " is : " + sum);
        }
    }
}