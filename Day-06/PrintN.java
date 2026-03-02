// code for Print 1 to N --------------------------

import java.util.*;

public class PrintN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int i = 1;
        while(i <= num){
            System.out.println(i);
            i++;
        }

    }
}