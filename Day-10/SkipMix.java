// code to Skip Multiples of 5 and 3 ------------------

public class SkipMix {
    public static void main(String[] args) {
        for(int i=1; i<=50; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}