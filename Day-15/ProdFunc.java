// code for Product Function using Functions --------------------------------

import java.util.*;

public class ProdFunc{

    public static int prod(int a , int b){
        int mult = a * b;
        return mult;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int prod = prod(a,b);
        System.out.println("Product of " + a + " and " + b + " is : " + prod);
    }
}