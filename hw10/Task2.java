package ua.buryi.hw10;
import java.util.ArrayList;
import java.util.List;
public class Task2 {
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }
    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int num : numbers) {
            stringList.add(String.valueOf(num));
        }
        return stringList;
    }
    public static List<String> doubling(List<String> strings) {
        List<String> doubledStrings = new ArrayList<>();
        for (String str : strings) {
            doubledStrings.add(str + str);
        }
        return doubledStrings;
    }
    public static void main(String[] args) {
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

