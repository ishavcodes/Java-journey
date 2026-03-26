// Sort each row of a 2D array individually ----------------------

import java.util.Arrays;
public class RowWiseSort {
    public static void main(String[] args) {
        int[][] a = {{9, 2, 5}, {4, 1, 8}};
        for(int[] row : a) Arrays.sort(row);
        for(int[] row : a) System.out.println(Arrays.toString(row));
    }
}