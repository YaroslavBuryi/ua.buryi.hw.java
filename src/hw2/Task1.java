package hw2;

public class Task1 {
    public static void main(String[] args) {
        int x1 = 1, y1 = 5;
        int x2 = 3, y2 = 5;
        int x3 = 6, y3 = 7;
        double area = calculateTriangleArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Площа треугольника: " + area);
    }
    public static double calculateTriangleArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }
}

