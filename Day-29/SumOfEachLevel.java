// Find sum of each "ring" or level of the matrix ----------------------

public class SumOfEachLevel {
    public static void main(String[] args) {
        int[][] a = {{1,1,1},{1,0,1},{1,1,1}};
        int sum = 0;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) if(i==0 || j==0 || i==2 || j==2) sum += a[i][j];
        }
        System.out.println("Outer level sum: " + sum);
    }
}