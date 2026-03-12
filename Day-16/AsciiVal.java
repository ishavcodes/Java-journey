// code to find ASCII value using Functions -----------------------------

import java.util.*;

public class AsciiVal{
    public static int getAscii(char ch){
        return (int) ch;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        int ans = getAscii(ch);
        System.out.println("Ascii value of character " + ch + " is : " + ans);
    }
}