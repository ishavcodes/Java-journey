// Prime number of the form 2^n - 1 --------------------

public class MersennePrime {
    public static void main(String[] args) {
        int n = 7; 
        boolean isMersenne = false;
        for(int i=0; i<=n; i++) {
            if(Math.pow(2, i) - 1 == n) { isMersenne = true; break; }
        }
        System.out.println(isMersenne ? "Mersenne Prime" : "Not");
    }
}