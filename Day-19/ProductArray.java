// code for Product of all elements ---------------------------

import java.util.*;

public class ProductArray{

    public static int prodArray(int arr[]){
        int prod = 1;
        for(int i = 0; i < arr.length; i++){
            prod = prod * arr[i];
        }
        return prod;
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

        int ans = prodArray(arr);

        System.out.println("Product of all elements is : " + ans);
    }
}