// Binary representation has even number of 1s ----------------------------

public class EvilNumber {
    public static void main(String[] args) {
        int n = 9; 
        int count = Integer.bitCount(n);
        System.out.println(count % 2 == 0 ? "Evil Number" : "Odious Number");
    }
}