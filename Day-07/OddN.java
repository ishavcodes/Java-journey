// code for Odd Numbers 1 to N using For Loop ------------------

import java.util.*;

public class OddN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}