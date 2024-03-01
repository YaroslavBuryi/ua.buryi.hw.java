package ua.buryi.hw9;
public class Task1 {
    public static void main(String[] args) {
        try {
            throw new MyException("Пример исключения");
        } catch (MyException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        } finally {
            System.out.println("Блок finally: Мы здесь!");
        }
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

