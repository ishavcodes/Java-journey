// code for Find Last Index using Linear Search ---------------------------

import java.util.*;

public class LastOccurrence{
    public static int lastOccur(int arr[], int key, int size){
        for(int i = size - 1; i > -1; i--){
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

        int arr[] = new int[size];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key : ");
        int key = sc.nextInt();

        int ans = lastOccur(arr, key, size);

        if(ans == -1){
            System.out.println("NOT Found.");
        }else{
            System.out.println("Last occured at index : " + ans);
        }
    }
}