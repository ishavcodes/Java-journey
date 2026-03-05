// code for Break at 5 using For Loop ------------------

import java.util.*;

public class BreakFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; 
            }
            System.out.println(i);
        }
    }
}