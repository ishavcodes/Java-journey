// code for Count occurrences of a Key ---------------------------

import java.util.*;

public class CheckFrequency{

    public static int countElement(int arr[], int key){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                count++;
            }
        }
        return count;
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

        int ans = countElement(arr, key);

        System.out.println("Frequency of " + key + " is : " + ans);
    }
}