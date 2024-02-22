package hw2;
import java.util.Scanner;
public class Advanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        String reversedNumber = reverseNumber(number);
        System.out.println("Число в обратном порядке: " + reversedNumber);
    }
    public static String reverseNumber(int number) {
        String numberAsString = String.valueOf(number);
        StringBuilder reversedNumberBuilder = new StringBuilder();
        for (int i = numberAsString.length() - 1; i >= 0; i--) {
            reversedNumberBuilder.append(numberAsString.charAt(i));
        }
        return reversedNumberBuilder.toString();
    }
}

