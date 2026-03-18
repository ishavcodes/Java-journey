// Check if one array is a subset of another ---------------------------

import java.util.*;

public class CheckSubset{

    public static boolean isSubset(int arr1[], int arr2[]){
        for(int i = 0; i < arr2.length; i++){
            boolean found = false;

            for(int j = 0; j < arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    found = true;
                    break;
                }
            }
            if(found == false){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of 1st array : ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array : ");
        int size2 = sc.nextInt();

        int arr2[] = new int[size2];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        if(isSubset(arr1, arr2)){
            System.out.println("Result : Yes, it is a subset.");
        }else{
            System.out.println("Result : No, it is NOT a subset.");
        }

        
    }
}