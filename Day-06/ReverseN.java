// code for Print N to 1 -----------------------

import java.util.*;

public class ReverseN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        while(n >= 1){
            System.out.println(n);
            n--;
        }
    }
}