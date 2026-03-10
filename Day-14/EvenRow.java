// code for Even Number Rows -----------------

import java.util.*;

public class EvenRow{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 10; j++){
                if(j % 2 == 0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}