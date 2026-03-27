// Fibonacci-like sequence starts with digits, eventually hits number --------------

import java.util.*;

public class KeithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int d = s.length();
        int[] arr = new int[n]; 
        for(int i=0; i<d; i++) arr[i] = s.charAt(i) - '0';
        
        int i = d, sum = 0;
        while(sum < n) {
            sum = 0;
            for(int j=1; j<=d; j++) sum += arr[i-j];
            arr[i++] = sum;
        }
        if(sum == n) System.out.println("Keith Number");
        else System.out.println("Not Keith");
    }
}