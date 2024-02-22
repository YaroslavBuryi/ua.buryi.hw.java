package hw6;
public class Task2 {
    public static void main(String[] args) {
        int[][] triangle = new int[5][];
        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];
        System.out.println("Длина массива triangle: " + triangle.length);
        for (int i = 0; i < triangle.length; i++) {  // неправильно задано условие i < triangle[i].length. Внутренний цикл должен зависеть от переменной j. Исправляем это условие на j < triangle[i].length
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println("Длина внутреннего массива: " + triangle[i].length);
                triangle[i][j] = 0;
            }
        }
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}




