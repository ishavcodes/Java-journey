// code for Even/Odd Sum using For Loop ------------------

import java.util.*;

public class DualSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int eSum = 0;
        int oSum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                eSum = eSum + i;
            }else{
                oSum = oSum + i;
            }
        }
        System.out.println("Sum of even numbers : " + eSum);
        System.out.println("Sum of odd numbers : " + oSum);
    }
}