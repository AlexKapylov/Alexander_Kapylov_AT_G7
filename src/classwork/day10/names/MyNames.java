package classwork.day10.names;

import java.util.ArrayList;
import java.util.List;

public class MyNames {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");
        for (String item : names) {
            System.out.printf("%s ", item);
        }
        System.out.println();
        names.set(1, "Оля");
        names.set(3, "Катя");
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s ", names.get(i));
        }
        System.out.println();
        names.remove("Оля");
        names.remove(2);
        for (String item : names) {
            System.out.printf("%s ", item);
        }
    }

}
