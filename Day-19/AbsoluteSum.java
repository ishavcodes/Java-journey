// code for Sum of Absolute values ---------------------------


import java.util.*;

public class AbsoluteSum{

    public static int absoluteSum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                sum = sum + (arr[i] * -1);
            }else{
                sum = sum + arr[i];
            }
        }
        return sum;
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

        int ans = absoluteSum(arr);

        System.out.println("Total Absolute Sum : " + ans);
    }
}