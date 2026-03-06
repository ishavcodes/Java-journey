// code for String based Exit Logic ------------------

import java.util.*;

public class RobotMove{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Command Robot (UP, DOWN, EXIT): ");
            String cmd = sc.next();
            if(cmd.equalsIgnoreCase("EXIT")){
                break;
            }
            System.out.println("Robot moving " + cmd);
        }while(true);
        System.out.println("Robot Shutting Down...");
    }
}