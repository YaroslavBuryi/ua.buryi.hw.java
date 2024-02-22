package hw11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static Map<Integer, List<String>> groupByLength(List<String> strings) {
        Map<Integer, List<String>> resultMap = new HashMap<>();
        for (String str : strings) {
            int length = str.length();
            if (!resultMap.containsKey(length)) {
                resultMap.put(length, new ArrayList<>());
            }
            resultMap.get(length).add(str);
        }
        return resultMap;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("тут", "там", "стол");
        Map<Integer, List<String>> resultMap = groupByLength(strings);
        for (Map.Entry<Integer, List<String>> entry : resultMap.entrySet()) {
            System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}");
        }
    }
}

