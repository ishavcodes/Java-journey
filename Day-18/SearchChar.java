// code for Search Character in Char Array ---------------------------

import java.util.*;

public class SearchChar{
    public static int getIndex(char arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        char arr[] = new char[size];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next().charAt(0);
        }

        System.out.print("Enter a key : ");
        char key = sc.next().charAt(0);

        int ans = getIndex(arr, key);

        if(ans == -1){
            System.out.println("Not Found.");
        }else{
            System.out.println("Element found at index : " + ans);
        }
    }
}