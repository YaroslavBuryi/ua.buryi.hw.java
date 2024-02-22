package hw12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            FileWriter writer = new FileWriter("output.csv");

            while (true) {
                System.out.println("Введите текст (для завершения введите 'end', для перехода на новую строку введите 'next'): ");
                String input = scanner.nextLine();

                if (input.equals("end")) {
                    break;
                } else if (input.equals("next")) {
                    writer.write("\n");
                } else {
                    writer.write(input.replaceAll(",", "\\,") + ", ");
                }
            }

            writer.close();
            scanner.close();
            System.out.println("CSV файл успешно создан.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании CSV файла: " + e.getMessage());
        }
    }
}

