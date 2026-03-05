// code for First Multiple of 7 and 11 ------------------

import java.util.*;

public class FirstMult {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                System.out.println("First number divisible by 7 & 11 is: " + i);
                break; 
            }
        }
    }
}