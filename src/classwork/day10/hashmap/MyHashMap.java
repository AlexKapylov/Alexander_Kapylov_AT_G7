package classwork.day10.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<>();
        String[] array = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }
        for (int item : words.keySet()) {
            System.out.println(item);
        }
        for (String item : words.values()) {
            System.out.println(item);
        }
        for (Map.Entry<Integer, String> item : words.entrySet()) {
            System.out.println(item);
        }
    }

}
