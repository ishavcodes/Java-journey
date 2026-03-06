// code for Continuous Digit Counting ------------------

import java.util.*;

public class DigitLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter number (0 to Exit): ");
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int count = 0, temp = n;
            do{ 
                temp /= 10; 
                count++; 
            }while(temp != 0);
            System.out.println("Digits in " + n + " is: " + count);
        }while(true);
    }
}