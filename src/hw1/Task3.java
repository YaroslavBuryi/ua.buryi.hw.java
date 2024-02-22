package hw1;
public class Task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("До обміну:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b; // a = 5 + 3 = 8
        b = a - b; // b = 8 - 3 = 5
        a = a - b; // a = 8 - 5 = 3
        System.out.println("Після обміну:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
