// code for Search and Replace element ---------------------------

import java.util.*;

public class SearchAndReplace{

    public static int[] replaceElement(int arr[], int target, int replacement){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                arr[i] = replacement;
            }
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

        System.out.print("Enter target element : ");
        int target = sc.nextInt();

        System.out.print("Enter replacement element : ");
        int replacement = sc.nextInt();

        System.out.println("Original Array : " + Arrays.toString(arr));

        int ans[] = replaceElement(arr, target, replacement);

        System.out.println("Updated Array : " + Arrays.toString(ans));
    }
}