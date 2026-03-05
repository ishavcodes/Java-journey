// code for Search Number and Break ------------------

import java.util.*;

public class Search {
    public static void main(String[] args) {
        int target = 45;
        for (int i = 1; i <= 100; i++) {
            if (i == target) {
                System.out.println("Target " + target + " found! Stopping search.");
                break;
            }
        }
    }
}