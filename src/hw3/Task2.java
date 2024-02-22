package hw3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        String[] words = inputString.split("\\s+");
        int wordCount = words.length;
        System.out.println("Количество слов в строке: " + wordCount);
    }
}
