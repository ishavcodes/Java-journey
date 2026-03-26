// Function to check if two matrices are identical -----------------------

import java.util.Arrays;

public class MatrixEquality {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}}, b = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepEquals(a, b) ? "Equal" : "Not Equal");
    }
}