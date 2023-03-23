package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class MyCountries {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");
        int forPunctuation = 1;
        for (String item : countries) {
            if (forPunctuation == countries.size()) {
                System.out.printf("%s", item);
            } else {
                System.out.printf("%s, ", item);
            }
            forPunctuation++;
        }
        System.out.println();
        System.out.println("-------------");
        int counter = 0;
        for (String item : countries) {
            if (item.length() < 7) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println("-------------");
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }

}
