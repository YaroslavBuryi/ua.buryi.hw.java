package hw3;
import java.util.Random;
import java.util.Scanner;
public class Advanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        System.out.println("Компьютер загадал число от 1 до 100. Попробуйте угадать!");
        int guessedNumber;
        do {
            System.out.print("Введите ваше предположение: ");
            guessedNumber = scanner.nextInt();

            if (guessedNumber > secretNumber) {
                System.out.println("Много");
            } else if (guessedNumber < secretNumber) {
                System.out.println("Мало");
            } else {
                System.out.println("Угадал!");
            }
        } while (guessedNumber != secretNumber);
    }
}

