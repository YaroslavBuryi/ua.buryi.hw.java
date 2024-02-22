package hw8;

public class Task2 {
    public static void main(String[] args) {
        // Реализация функционального интерфейса через лямбда-выражение
        Pow pow = (number, power) -> {
            int result = 1;
            for (int i = 0; i < power; i++) {
                result *= number;
            }
            return result;
        };

        // Пример использования
        int number = 2;
        int power = 3;
        int result = pow.pow(number, power);
        System.out.println(number + " в степени " + power + " равно " + result);
    }

    // Функциональный интерфейс
    interface Pow {
        int pow(int number, int power);
    }
}

