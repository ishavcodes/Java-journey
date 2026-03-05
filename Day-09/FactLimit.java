// code for Factorial with Limit Break ------------------

import java.util.*;

public class FactLimit{
    public static void main(String[] args) {
        long fact = 1;
        for (int i = 1; i <= 20; i++) {
            fact *= i;
            if (fact > 1000000) { 
                System.out.println("Limit reached at " + i + "! Fact: " + fact);
                break;
            }
            System.out.println(i + "! = " + fact);
        }
    }
}