// Find 2nd smallest element (without sorting) ---------------------------

import java.util.*;

public class SecondSmallest{

    public static int findSecondSmallest(int arr[]){
        int Small = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < small){
                secondSmallest = small;
                small = arr[i];
            }else if(arr[i] > small && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        if(secondSmallest == Integer.MAX_VALUE){
            return -1;
        }
        return secondSmallest;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int ans = findSecondSmallest(arr);

        if(ans == -1){
            System.out.println("No second smallest element found.");
        }else{
            System.out.println("The second smallest element is " + ans);
        }
    }
}