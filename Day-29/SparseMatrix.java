// Check if a matrix is Sparse (More zeros than elements) --------------------

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 0, 0}, {0, 0, 2}, {0, 0, 0}};
        int count = 0;
        for(int[] r : a) for(int x : r) if(x == 0) count++;
        System.out.println(count > (3*3)/2 ? "Sparse Matrix" : "Not Sparse");
    }
}