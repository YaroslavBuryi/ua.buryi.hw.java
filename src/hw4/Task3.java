package hw4;
import java.util.Arrays;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        // Размер массива
        int size = 2000;
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1; // случайные числа от 1 до 100 включительно
        }
        int[] processedArray = processArray(array);

        // Вывод результата (опционально)
        // for (int num : processedArray) {
        //     System.out.print(num + " ");
        // }
    }
    public static int[] processArray(int[] array) {
        int[] processedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < processedArray.length; i++) {
            if (processedArray[i] % 2 == 0) {
                processedArray[i] = 0;
            }
        }
        return processedArray;
    }
}
