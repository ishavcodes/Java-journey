// Java Program to display weather message based on temperature ------------------------------

import java.util.*;

public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature : ");
        int temp = sc.nextInt();
        if(temp > 30){
            System.out.println("Hot");
        }
        else{
            System.out.println("Normal");
        }
    }
}