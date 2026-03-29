// Product of two consecutive integers (n * (n+1)) -------------------


import java.util.*;

public class PronicNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPronic = false;
        for(int i = 0; i <= n; i++){
            if(i * (i + 1) == n){
                isPronic = true;
                break;
            }
        }
        if(isPronic == true){
            System.out.println("Pronic Number.");
        }else{
            System.out.println("Not Pronic Number.");
        }
    }
}