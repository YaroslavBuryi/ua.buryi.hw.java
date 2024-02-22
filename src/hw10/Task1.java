package hw10;
import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        // Создаем ArrayList и добавляем в него элементы
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        // Обход с помощью цикла for
        System.out.println("Обход с помощью цикла for:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Обход с помощью цикла for-each
        System.out.println("\nОбход с помощью цикла for-each:");
        for (String element : list) {
            System.out.println(element);
        }

        // Обход с помощью while
        System.out.println("\nОбход с помощью цикла while:");
        int index = 0;
        while (index < list.size()) {
            System.out.println(list.get(index));
            index++;
        }

        // Обход с помощью итератора
        System.out.println("\nОбход с помощью итератора:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

