// code for Count Element using Linear Search ---------------------------

import java.util.*;

public class CountOccurrences{
    public static int countOccur(int arr[], int key){
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
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter numbers of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to find : ");
        int key = sc.nextInt();

        int count = countOccur(arr, key);

        System.out.println("Element " + key + " occurs " + count + " times.");
    }
}