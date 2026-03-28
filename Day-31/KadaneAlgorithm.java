// Find the contiguous subarray with the largest sum (O(n)) ----------------------------

public class KadaneAlgorithm{
    public static void main(String[] args){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = arr[0], currSum = 0;
        for(int x : arr){
            currSum += x;
            if(currSum > maxSum) maxSum = currSum;
            if(currSum < 0) currSum = 0;
        }
        System.out.println("Maximum Subarray Sum : " + maxSum);
    }
}