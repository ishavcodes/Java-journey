// Java Program for a simple Login System (Username & Password) ---------------------------------

import java.util.*;

public class Login{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username : ");
        int user = sc.nextInt();
        System.out.print("Enter Password : ");
        int pass = sc.nextInt();
        if(user == 111 && pass == 222){
            System.out.println("Login Success");
        }
        else{
            System.out.println("Wrong Password");
        }
    }
}