package hw11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static Map<String, Integer> countLetters(List<String> strings) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String str : strings) {
            resultMap.put(str, str.length());
        }
        return resultMap;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("тут", "там", "стол");
        Map<String, Integer> resultMap = countLetters(strings);
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}");
        }
    }
}

