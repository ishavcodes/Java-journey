// Count frequency of every element in the array ---------------------------

import java.util.*;

public class FrequencyAll{

    public static void countFrequency(int arr[], int size){
        boolean visited[] = new boolean[size];

        for(int i = 0; i < size; i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j = i + 1; j < size; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " + count + " times");
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

        countFrequency(arr, size);
    }
}