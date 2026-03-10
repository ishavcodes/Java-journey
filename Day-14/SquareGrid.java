// code for Square Number Grid ---------------------------

import java.util.*;

public class SquareGrid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print(i*i + " ");
            }
            System.out.println();
        }
    }
}