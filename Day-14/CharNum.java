// code for Char-Num Mix Pattern -----------------------

import java.util.*;

public class CharNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row num : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            char ch = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print(ch + "" + j + " ");
                ch++;
            }
            System.out.println();
        }
    }
}