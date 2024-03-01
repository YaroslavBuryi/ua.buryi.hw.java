package ua.buryi.hw11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class Task3 {
    public static void fillList(List<Integer> list, int n) {
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
    }
    public static void pickRandomElements(List<Integer> list, int n) {
        Random rand = new Random();
        int size = list.size();
        for (int i = 0; i < n; i++) {
            int index = rand.nextInt(size);
            list.get(index); // Получаем элемент по случайному индексу
        }
    }
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        fillList(arrayList, 1000000);
        long endTime = System.currentTimeMillis();
        System.out.println("Время заполнения ArrayList: " + (endTime - startTime) + " мс");
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        fillList(linkedList, 1000000);
        endTime = System.currentTimeMillis();
        System.out.println("Время заполнения LinkedList: " + (endTime - startTime) + " мс");
        startTime = System.currentTimeMillis();
        pickRandomElements(arrayList, 1000000);
        endTime = System.currentTimeMillis();
        System.out.println("Время выбора элементов из ArrayList: " + (endTime - startTime) + " мс");
        startTime = System.currentTimeMillis();
        pickRandomElements(linkedList, 1000000);
        endTime = System.currentTimeMillis();
        System.out.println("Время выбора элементов из LinkedList: " + (endTime - startTime) + " мс");
    }
}

