package hw5;
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println("До:");
        printMatrix(matrix);
        int[][] transposedMatrix = transposeMatrix(matrix);
        System.out.println("\nПосле:");
        printMatrix(transposedMatrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] transposed = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        return transposed;
    }
}

