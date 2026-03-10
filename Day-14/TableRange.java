// code for Tables from 1 to 5 ---------------

public class TableRange{
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            System.out.print("Table of " + i + " : ");
            for(int n = 1; n <= 10; n++){
                System.out.print(n*i + " ");
            }
            System.out.println();
        }
    }
}