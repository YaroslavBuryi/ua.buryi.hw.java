package hw4;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        int size = 400;
        int[] array = generateArray(size);
        double averageArithmetic = calculateArithmeticAverage(array);
        double averageGeometric = calculateGeometricAverage(array);
        System.out.println("Среднее арифметическое: " + averageArithmetic);
        System.out.println("Среднее геометрическое: " + averageGeometric);
    }
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        return array;
    }
    public static double calculateArithmeticAverage(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static double calculateGeometricAverage(int[] array) {
        double product = 1;
        for (int num : array) {
            product *= num;
        }
        return Math.pow(product, 1.0 / array.length);
    }
}

