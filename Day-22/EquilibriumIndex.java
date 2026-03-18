// Index where sum of left side = sum of right side ---------------------------

import java.util.*;

public class EquilibriumIndex{

    public static int findEquilibrium(int arr[], int n){
        int totalSum = 0;
        int leftSum = 0;

        for(int x : arr) totalSum += x;

        for(int i = 0; i < n; i++){
            totalSum -= arr[i];

            if(leftSum == totalSum){
                return i;
            }

            leftSum += arr[i];
        }
        return -1;
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

        int ans = findEquilibrium(arr, size);

        if(ans == -1){
            System.out.println("Not equilibrium.");
        }else{
            System.out.println("Equilibrium Index is : " + ans);
        }
    }
}