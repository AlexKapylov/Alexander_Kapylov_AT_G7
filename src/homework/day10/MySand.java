package homework.day10;

import homework.day10.objects.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySand {

    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));
        for (Sand item : sandbox) {
            System.out.printf("%s ", item.getWeight());
        }
        System.out.println();
        System.out.println("-------------");
        for (Sand item : sandbox) {
            System.out.printf("%s ", item.getName());
        }
        System.out.println();
        System.out.println("-------------");
        Map<Integer, Sand> myMap = new HashMap<>();
        for (int i = 0; i < sandbox.size(); i++) {
            myMap.put(i, sandbox.get(i));
        }
        for (int item : myMap.keySet()) {
            System.out.printf("%s ", item);
        }
        System.out.println();
        System.out.println("-------------");
        for (Sand item : myMap.values()) {
            System.out.println(item);
        }
        System.out.println("-------------");
        for (Map.Entry<Integer, Sand> item : myMap.entrySet()) {
            System.out.println(item);
        }
    }

}
