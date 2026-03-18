// Elements greater than all elements to their right ---------------------------

import java.util.*;

public class LeadersInArray{

    public static void findLeaders(int arr[]){
        int n = arr.length;
        if(n == 0) return;

        int currentMax = arr[n-1];
        System.out.print(currentMax + " ");

        for(int i = n - 2; i >= 0; i--){
            if(arr[i] > currentMax){
                System.out.print(arr[i] + " ");
                currentMax = arr[i];
            }
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

        System.out.print("Leaders are : ");
        findLeaders(arr);
    }
}