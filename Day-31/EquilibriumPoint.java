// Find index where sum of left side == sum of right side ----------------------

public class EquilibriumPoint{
    public static void main(String[] args){
        int[] a = {1, 3, 5, 2, 2};
        int totalSum = 0, leftSum = 0;
        for(int x : a) totalSum += x;
        for(int i = 0; i < a.length; i++){
            totalSum -= a[i];
            if(leftSum == totalSum){
                System.out.println("Equilibrium at index : " + i);
                return;
            }
            leftSum += a[i];
        }
        System.out.println("-1");
    }
}