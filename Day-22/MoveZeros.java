// Push all 0s to the end while maintaining order ---------------------------

import java.util.*;

public class MoveZeros{

    public static int[] moveZeros(int arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }

        while(count < arr.length){
            arr[count] = 0;
            count++;
        }

        return arr;
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

        int ans[] = moveZeros(arr);

        System.out.println(Arrays.toString(ans));
    }
}