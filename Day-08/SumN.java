// code for Sum of N using Do-While Loop ------------

import java.util.*;

public class SumN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        do{
            sum = sum + i;
            i++;
        }while(i <= n);
        System.out.println(sum);
    }
}