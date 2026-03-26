// Check if a matrix is symmetric (Matrix == Transpose) ----------------------

public class SymmetricMatrix {
    public static boolean isSymmetric(int[][] a, int n) {
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                if(a[i][j] != a[j][i]) return false;
        return true;
    }
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {2, 1}};
        System.out.println(isSymmetric(a, 2) ? "Symmetric" : "Not Symmetric");
    }
}