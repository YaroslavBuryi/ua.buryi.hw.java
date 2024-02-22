package hw5;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        int[][] originalArray = new int[4][3];
        fillArray(originalArray);
        System.out.println("Исходный массив:");
        printArray(originalArray);
        int[][] copiedArray = copyArray(originalArray);
        System.out.println("\nКопия массива:");
        printArray(copiedArray);
    }
    public static void fillArray(int[][] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = counter;
                counter++;
            }
        }
    }
    public static int[][] copyArray(int[][] array) {
        int[][] copy = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            copy[i] = Arrays.copyOf(array[i], array[i].length);
        }
        return copy;
    }
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
