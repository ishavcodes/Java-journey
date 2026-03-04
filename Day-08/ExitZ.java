// code for Exit on Zero using Do-While Loop --------------------

import java.util.*;

public class ExitZ{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter numbers : ");
            n = sc.nextInt();
            if (n != 0){
                System.out.println("You entered : " + n);
            }
        }while(n != 0);
        System.out.println("Loop Terminated.");
    }
}