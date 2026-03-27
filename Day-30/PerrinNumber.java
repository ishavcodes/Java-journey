// Sequence where P(n) = P(n-2) + P(n-3) ---------------------

public class PerrinNumber {
    public static void main(String[] args) {
        int p0=3, p1=0, p2=2, p3;
        System.out.print(p0+" "+p1+" "+p2+" ");
        for(int i=3; i<10; i++) {
            p3 = p1 + p0;
            System.out.print(p3 + " ");
            p0=p1; p1=p2; p2=p3;
        }
    }
}