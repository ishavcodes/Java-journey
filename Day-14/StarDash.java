// code for Star-Dash Alternate Pattern ---------------

import java.util.*;

public class StarDash{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 4; j++){
                if(i % 2 != 0){
                    System.out.print("- ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}