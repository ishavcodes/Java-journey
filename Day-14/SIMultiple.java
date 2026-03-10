// code for Multiple SI Calculation ---------------------

import java.util.*;

public class SIMultiple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = 5;
        int t = 2;
        for(int p = 1000; p <= 3000; p += 1000){
            int SI = (p*r*t)/100;
            System.out.println("Principal : " + p + " | Interest : " + SI );
        }
    }
}