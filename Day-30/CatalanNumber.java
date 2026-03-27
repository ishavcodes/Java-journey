// Calculate nth Catalan number (used in tree structures) --------------------------

public class CatalanNumber {
    public static long fact(int n) {
        long f = 1;
        for(int i=1; i<=n; i++) f *= i;
        return f;
    }
    public static void main(String[] args) {
        int n = 4;
        long res = fact(2*n) / (fact(n+1) * fact(n));
        System.out.println(n + "th Catalan Number: " + res);
    }
}