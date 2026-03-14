// code for Find Mid element of Sorted Array ---------------------------

import java.util.*;

public class MidElement{
    public static void getMid(int arr[], int size){
        int start = 0;
        int end = size - 1;
        int mid = (start + end)/2;
        System.out.println("Middle Index : " + mid);
        System.out.println("Middle Element : " + arr[mid]);
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

        getMid(arr, size);
    }
}