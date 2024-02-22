package hw3;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        String stringWithoutSpaces = inputString.replaceAll("\\s", "");
        boolean isPalindrome = isPalindrome(stringWithoutSpaces);
        if (isPalindrome) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
