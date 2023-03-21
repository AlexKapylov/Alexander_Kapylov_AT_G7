package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class MyCities {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");
        for (String item : cities) {
            System.out.println(item);
        }
        System.out.println("-------------");
        int counter = 0;
        for (String item : cities) {
            counter = counter + item.length();
        }
        System.out.println(counter);
        System.out.println("-------------");
        for (int i = 0; i < cities.size(); i++) {
            System.out.printf("%s ", cities.get(i));
        }
    }

}
