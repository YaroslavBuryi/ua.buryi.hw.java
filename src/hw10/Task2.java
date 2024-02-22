package hw10;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    // Метод для вычисления суммы элементов списка
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Метод для получения списка нечетных чисел из исходного списка
    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    // Метод для преобразования списка целых чисел в список строк
    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int num : numbers) {
            stringList.add(String.valueOf(num));
        }
        return stringList;
    }

    // Метод для удвоения и конкатенации каждой строки в списке
    public static List<String> doubling(List<String> strings) {
        List<String> doubledStrings = new ArrayList<>();
        for (String str : strings) {
            doubledStrings.add(str + str);
        }
        return doubledStrings;
    }

    public static void main(String[] args) {
        // Пример использования методов
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Сумма элементов списка: " + getSum(numbers));

        List<Integer> oddNumbers = getOddNumbers(numbers);
        System.out.println("Нечетные числа: " + oddNumbers);

        List<String> stringList = convertToStringList(numbers);
        System.out.println("Преобразованный список строк: " + stringList);

        List<String> doubledStrings = doubling(stringList);
        System.out.println("Удвоенные и конкатенированные строки: " + doubledStrings);
    }
}

