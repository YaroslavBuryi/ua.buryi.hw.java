package hw2;
public class Task3 {
    public static void main(String[] args) {
        double number1 = -5;
        double number2 = 7;
        double number3 = 11;
        double minAbsNumber = Math.min(Math.abs(number1), Math.min(Math.abs(number2), Math.abs(number3)));
        if (minAbsNumber == Math.abs(number1)) {
            System.out.println("Меньшее по модулю число: " + number1);
        } else if (minAbsNumber == Math.abs(number2)) {
            System.out.println("Меньшее по модулю число: " + number2);
        } else {
            System.out.println("Меньшее по модулю число: " + number3);
        }
    }
}

