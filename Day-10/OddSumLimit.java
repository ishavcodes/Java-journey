// code for Odd Sum with Break ------------------

public class OddSumLimit {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=100; i++) {
            if(i % 2 != 0) {
                sum += i;
                if(sum > 100) {
                    System.out.println("Sum exceeded 100 at number: " + i);
                    break;
                }
            }
        }
        System.out.println("Final Sum: " + sum);
    }
}