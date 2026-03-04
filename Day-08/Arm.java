// code for Armstrong Number using Do-While Loop ----------------------------

import java.util.*;

public class Arm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        do{
            int ld = n%10;
            sum = sum + (ld*ld*ld);
            n = n/10;
        }while(n > 0);
        if(sum == temp){
            System.out.println("It's Armstrong number.");
        }else{
            System.out.println("It's not Armstrong number.");
        }
    }
}