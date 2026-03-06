// code for First Perfect Square Break ------------------

import java.util.*;

public class FirstSq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=n; i<=100; i++) {
            double root = Math.sqrt(i);
            if(root == (int)root) {
                System.out.println("First Perfect Square after " + n + " : " + i);
                break;
            }
        }
    }
}