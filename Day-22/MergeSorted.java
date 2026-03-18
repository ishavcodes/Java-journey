// Merge two ALREADY sorted arrays into a third sorted array ---------------------------

import java.util.*;

public class MergeSorted{

    public static int[] isSorted(int arrA[], int arrB[]){
        int n1 = arrA.length;
        int n2 = arrB.length;
        int res[] = new int[n1 + n2];

        int i = 0; 
        int j = 0;
        int k = 0;

        while(i < n1 && j < n2){
            if(arrA[i] < arrB[j]){
                res[k] = arrA[i];
                i++;
            }else{
                res[k] = arrB[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            res[k] = arrA[i];
            i++;
            k++;
        }

        while(j < n2){
            res[k] = arrB[j];
            j++;
            k++;
        }
        return res;
    }
    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array : ");
        int sizeA = sc.nextInt();

        int arrA[] = new int[sizeA];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arrA.length; i++){
            arrA[i] = sc.nextInt();
        }

        System.out.print("Enter size of array : ");
        int sizeB = sc.nextInt();

        int arrB[] = new int[sizeB];

        System.out.println("Enter elements of array : ");
        for(int i = 0; i < arrB.length; i++){
            arrB[i] = sc.nextInt();
        }

        int ans[] = isSorted(arrA, arrB);

        System.out.println(Arrays.toString(ans));
    }
}