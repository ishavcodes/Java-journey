// code for Squares with Limit ------------------

public class SqLimit{
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            int sq = i * i;
            if(sq > 50){
                continue;
            }
            System.out.println(i + " square is " + sq);
        }
    }
}