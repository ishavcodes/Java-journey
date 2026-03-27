// Number with no repeated digits (Ex: 123 is unique, 121 is not)----------------------

public class UniqueNumber {
    public static void main(String[] args) {
        int n = 123;
        boolean[] vis = new boolean[10];
        while(n > 0) {
            if(vis[n%10]) { System.out.println("Not Unique"); return; }
            vis[n%10] = true; n /= 10;
        }
        System.out.println("Unique Number");
    }
}