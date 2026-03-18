// Count elements greater than their neighbors (Peak) ---------------------------

import java.util.*;

public class CountGreater{

    public static int findGreater(int arr[], int size){
        if(size == 1){
            return 1;
        }
        int count = 0;
        for(int i = 0; i < size;  i++){
            if(i == 0 ){
                if(arr[i] > arr[i + 1]){
                    count++;
                }
            }else if(i == size - 1 ){
                if(arr[i] > arr[i - 1]){
                    count++;
                }
            }
            else{
                if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                    count++;
                }
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

        int ans = findGreater(arr, size);

        System.out.println("Total Peak Elements : " + ans);
    }
}
