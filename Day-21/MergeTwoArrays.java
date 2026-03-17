// Code to Merge two arrays into one ---------------------------

import java.util.*;

public class MergeTwoArrays{

    public static int[] mergeArray(int arr1[],int arr2[], int s1, int s2){
        int res[] = new int[s1 + s2];
        for(int i = 0; i < arr1.length; i++){
            res[i] = arr1[i];
        }
        for(int j = 0; j < arr2.length; j++){
            res[s1 + j] = arr2[j];
        }
        return res;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int s1 = sc.nextInt();

        int arr1[] = new int[s1];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array : ");
        int s2 = sc.nextInt();

        int arr2[] = new int[s2];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int ans[] = mergeArray(arr1, arr2, s1, s2);

        System.out.println("Output : " + Arrays.toString(ans));
    }
}



