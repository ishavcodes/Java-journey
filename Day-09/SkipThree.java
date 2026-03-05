// code for Skip Multiples of 3 using For Loop ------------------ 

import java.util.*;

public class SkipThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}