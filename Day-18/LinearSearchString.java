// code for Linear Search on String Array ---------------------------

import java.util.*;

public class LinearSearchString{
    public static int getIndex(String arr[], String key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(key)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        String arr[] = new String[size];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
        }

        System.out.print("Enter a key : ");
        String key = sc.next();

        int ans = getIndex(arr, key);

        if(ans == -1){
            System.out.println("Not Found.");
        }else{
            System.out.println("Element found at index : " + ans);
        }
    }
}