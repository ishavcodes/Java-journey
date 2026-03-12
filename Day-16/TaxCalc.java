// code for Income Tax Calculation using Functions ------------------------------

import java.util.*;

public class TaxCalc{
    public static float income(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n > 1000000){
            float tax = n * 0.2f;
            return tax;
        }else if( n > 500000){
            float tax2 = n * 0.1f;
            return tax2;
        }else{
            int tax3 = 0;
            return tax3;
        }
        
    }


    public static void main(String[] args){
        
        float tax = income();
        System.out.println("Your tax is : " + tax);
    }
}