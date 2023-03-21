package homework.day10;

import homework.day10.objects.Chair;
import homework.day10.objects.Sand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyChairs {

    public static void main(String[] args) {
        List<Chair> furniture = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));
        for (Chair item : furniture) {
            System.out.printf("%s ", item.getHeight() * item.getWidth());
        }
        System.out.println();
        System.out.println("-------------");
        Map<Integer, Chair> myMap = new HashMap<>();
        for (int i = 0; i < furniture.size(); i++) {
            myMap.put(i, furniture.get(i));
        }
        for (int item : myMap.keySet()) {
            System.out.printf("%s ", item);
        }
        System.out.println();
        System.out.println("-------------");
        for (Chair item : myMap.values()) {
            System.out.println(item);
        }
        System.out.println("-------------");
        for (Map.Entry<Integer, Chair> item : myMap.entrySet()) {
            System.out.println(item);
        }
    }

}
