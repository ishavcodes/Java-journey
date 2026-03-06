// code for Fibonacci Series ------------------

public class Fibo{
    public static void main(String[] args) {
        int a=0, b=1;
        System.out.print(a + " " + b + " ");
        for(int i=3; i<=10; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}