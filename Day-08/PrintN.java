// code for Print 1 to N using Do-While Loop  -------------

import java.util.*;

public class PrintN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= n);
    }
}