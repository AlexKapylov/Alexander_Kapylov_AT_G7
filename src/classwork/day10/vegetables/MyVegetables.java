package classwork.day10.vegetables;

import java.util.ArrayList;
import java.util.List;

public class MyVegetables {

    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");
        for (String item : vegetables) {
            System.out.printf("%s ", item);
        }
        System.out.println();
        int counter = 0;
        for (String item : vegetables) {
            if (item.contains("а")) {
                counter++;
            }
        }
        System.out.println(counter);
        for (int i = 0; i < vegetables.size(); i++) {
            System.out.printf("%s ", vegetables.get(i));
        }
        System.out.println();
        vegetables.remove("Огурец");
        vegetables.remove(2);
        for (String item : vegetables) {
            System.out.printf("%s ", item);
        }
    }

}
