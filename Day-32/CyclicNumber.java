// Digits shifted by 1 give another multiple of number ----------------------

import java.util.*;

public class CyclicNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = n * 2;
        char[] c1 = Long.toString(n).toCharArray();
        char[] c2 = Long.toString(m).toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2)){
            System.out.println("Cyclic Number.");
        }else{
            System.out.println("Not Cyclic Number.");
        }
    }
}