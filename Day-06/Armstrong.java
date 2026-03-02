// code for Armstrong Number ----------------------

import java.util.*;

public class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int last_digit = 0;
        while(n > 0){
            last_digit = n % 10;
            sum = sum + (last_digit * last_digit * last_digit);
            n /= 10;
        }
        if(sum == temp){
            System.out.println("It's Armstrong number.");
        }else{
            System.out.println("It's not Armstrong number.");
        }
    }
}