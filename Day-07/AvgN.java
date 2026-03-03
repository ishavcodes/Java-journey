// code for Average of N using For Loop ------------------

import java.util.*;

public class AvgN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        double avg = (double)sum/temp;
        System.out.println("Average of " + temp + " is : " + avg);
    }
}