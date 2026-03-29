// Number whose square ends with the same digits as number --------------------

import java.util.*;

public class AutomorphicNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        String s1 = Integer.toString(n);
        String s2 = Integer.toString(sq);
        if(s2.endsWith(s1)){
            System.out.println("Automorphic.");
        }else{
            System.out.println("Not Automorphic.");
        }
    }
}