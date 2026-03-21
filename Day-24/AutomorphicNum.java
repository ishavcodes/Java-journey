// Check if square of a number ends with the number itself ------------------------

import java.util.*;
public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int square = num * num;
        
        
        int temp = num, count = 0;
        while(temp > 0) { temp /= 10; count++; }
        
        
        int lastDigits = (int)(square % Math.pow(10, count));
        
        if(num == lastDigits) System.out.println("Automorphic Number");
        else System.out.println("Not Automorphic");
    }
}