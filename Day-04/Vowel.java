// Java Program to check if a character is a Vowel or Consonant -------------------------------------

import java.util.*;

public class Vowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("It's vowel");
        }
        else{
            System.out.println("It's consonant");
        }
    }
}