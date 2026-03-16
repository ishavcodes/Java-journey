// code for Find Middle element(s) ---------------------------

import java.util.*;

public class FindMiddle{

    public static void getMiddle(int arr[], int size){
        if(size % 2 != 0){
            System.out.println("Middle : " + arr[size/2]);
        }else{
            System.out.println("Middle : " + arr[(size/2)-1] + " & " + arr[size/2]);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        getMiddle(arr, size);
    }
}