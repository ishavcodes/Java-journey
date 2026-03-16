// code for Count number of Zeros ---------------------------

import java.util.*;

public class CountZeros{

    public static int countZero(int arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
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

        int ans = countZero(arr);

        System.out.println("Number of zeros in array : " + ans);
    }
}