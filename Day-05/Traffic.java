// Java Program to simulate Traffic Lights using Switch -----------------------

import java.util.*;

public class Traffic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light color : ");
        String light = sc.nextLine();
        switch(light){
            case "red" : System.out.println("STOP");
                       break;
            case "green" : System.out.println("GO");
                       break;
            case "yellow" : System.out.println("READY / SLOW DOWN");
                       break;
            default : System.out.println("Wrong Color");
        }
    }
}