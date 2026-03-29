// Number + 2*Number + 3*Number contains all digits 1-9 ----------------------

import java.util.*;

public class FascinatingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "" + n + (n * 2) + (n * 3);
        boolean flag = true;
        for(char c = '1'; c <= '9'; c++){
            int count = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == c){
                    count++;
                }
            }
            if(count != 1){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("Fascinating Number.");
        }else{
            System.out.println("Not Fascinating Number.");
        }
    }
}