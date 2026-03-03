// code for Sum of N using For Loop ------------------

import java.util.*;

public class ForSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(; n > 0; n--){
            sum = sum + n;
        }
        System.out.println(sum);
    }
}