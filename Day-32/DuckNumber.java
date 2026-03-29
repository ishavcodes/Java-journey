// Number contains a zero but not at the beginning ------------------------

import java.util.*;

public class DuckNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(0) != '0' && s.contains("0")){
            System.out.println("Duck Number.");
        }else{
            System.out.println("Not Duck Number.");
        }
    }
}