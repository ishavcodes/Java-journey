// Java Program to check Vowel using Switch Case ----------------------------

import java.util.*;

public class VowelSwitch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabet character : ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a' : System.out.println("It is vowel.");
                       break;
            case 'e' : System.out.println("It is vowel.");
                       break;
            case 'i' : System.out.println("It is vowel.");
                       break;
            case 'o' : System.out.println("It is vowel.");
                       break;
            case 'u' : System.out.println("It is vowel.");
                       break;
            default : System.out.println("It is consonant");
        }
    }
}