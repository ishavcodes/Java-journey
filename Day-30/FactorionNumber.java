// Sum of factorials of digits equals the number (Ex: 145) ----------------------

public class FactorionNumber {
    public static void main(String[] args) {
        int n = 145, temp = n, sum = 0;
        while(temp > 0) {
            int d = temp % 10, f = 1;
            for(int i=1; i<=d; i++) f *= i;
            sum += f; temp /= 10;
        }
        System.out.println(sum == n ? "Factorion" : "Not Factorion");
    }
}