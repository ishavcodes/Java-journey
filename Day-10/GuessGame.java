// code for Guessing Number Loop ------------------

import java.util.*;

public class GuessGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 7;
        while(true) {
            System.out.print("Guess the secret number: ");
            int n = sc.nextInt();
            if(n == secret) {
                System.out.println("Bingo! You won.");
                break;
            }
        }
    }
}