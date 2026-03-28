// Rearrange array in Max-Min form (Max, Min, 2ndMax, 2ndMin...) --------------------------------

import java.util.*;

public class RearrangeArray{
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6};
        int n = a.length, l = 0, r = n - 1;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                res[i] = a[r--];
            }else{
                res[i] = a[l++];
            }
        }
        System.out.println("Rearranges : " + Arrays.toString(res));
    }
}