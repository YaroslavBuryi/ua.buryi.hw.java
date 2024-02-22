package hw5;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        int[] array = {10, 8, 6, 5, 3, 1};
        System.out.println("Массив:");
        printArray(array);
        boolean orderedDescending = isOrderedDescending(array);
        if (orderedDescending) {
            System.out.println("Массив упорядочен по убыванию");
        } else {
            System.out.println("Массив не упорядочен по убыванию");
        }
    }
    public static boolean isOrderedDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;
    }
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
