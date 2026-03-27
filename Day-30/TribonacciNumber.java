// Sum of previous THREE numbers (0,0,1,1,2,4,7...) ------------------

public class TribonacciNumber {
    public static void main(String[] args) {
        int a=0, b=0, c=1, d;
        System.out.print(a+" "+b+" "+c+" ");
        for(int i=1; i<=7; i++) {
            d = a + b + c;
            System.out.print(d + " ");
            a = b; b = c; c = d;
        }
    }
}