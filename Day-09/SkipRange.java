// code for Skip Range 10 to 20 ------------------

import java.util.*;

public class SkipRange {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i >= 10 && i <= 20) continue;
            System.out.println(i);
        }
    }
}