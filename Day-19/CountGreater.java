// code for Count elements greater than Value ---------------------------

import java.util.*;

public class CountGreater{

    public static int greaterNum(int arr[], int key){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(key < arr[i]){
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

        int ans = greaterNum(arr, key);

        System.out.println("Element greater than " + key + " : " + ans);
    }
}