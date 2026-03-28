// Find the next lexicographically greater permutation --------------------------

import java.util.*;

public class NextPermutation{
    public static void main(String[] args){
        int[] a = {1, 2, 3};
        int i = a.length - 2;
        while(i >= 0 && a[i] >= a[i + 1]) i--;
        if(i >= 0){
            int j = a.length - 1;
            while(a[j] <= a[i]) j--;
            swap(a, i, j);
        }
        reverse(a, i + 1);
        System.out.println("Next Permutation : " + Arrays.toString(a));
    }
    static void swap(int[] a, int i, int j){int t = a[i]; a[i] = a[j]; a[j] = t;}
    static void reverse(int[] a, int start){
        int i = start, j = a.length - 1;
        while(i < j) swap(a, i++, j--);
    }
}