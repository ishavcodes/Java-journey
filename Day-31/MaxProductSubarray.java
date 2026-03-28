// Find the maximum product of a contiguous subarray -------------------------

public class MaxProductSubarray{
    public static void main(String[] args){
        int[] a = {2, 3, -2, 4};
        double max = a[0], pre = 1, suff = 1;
        int n = a.length;
        for(int i = 0; i < n; i++){
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;
            pre *= a[i];
            suff *= a[n - 1 - i];
            max = Math.max(max, Math.max(pre, suff));
        }
        System.out.println("Max Product : " + (int)max);
    }
}