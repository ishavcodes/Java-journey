// Java Program to Calculate Profit or Loss -----------------------

import java.util.*;

public class Profit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        float cp = sc.nextFloat();
        System.out.print("Enter selling price : ");
        float sp = sc.nextFloat();
        if(sp > cp){
            float profit = sp - cp;
            System.out.println("Profit of " + profit);
        }
        else if(cp > sp){
            float loss = cp - sp;
            System.out.println("Loss of " + loss);
        }
        else{
            System.out.println("No Profit , No Loss");
        }
        
    }
}