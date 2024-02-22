package hw4;
import java.util.Arrays;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        // Размер массива
        int size = 1000;
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000) + 1; // случайные числа от 1 до 1000 включительно
        }
        int[] originalArray = Arrays.copyOf(array, array.length);
        int primeCount = countPrimes(originalArray);
        System.out.println("Количество простых чисел в массиве: " + primeCount);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int countPrimes(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
}
