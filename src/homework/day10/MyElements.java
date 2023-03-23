package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class MyElements {

    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");
        for (String item : elements) {
            System.out.printf("%s ", item);
        }
        System.out.println();
        System.out.println("-------------");
        int counter = 0;
        for (String item : elements) {
            String[] wordsArray = item.split("[\\p{Punct}\\d\\s]+");
            if (wordsArray.length > 1) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println("-------------");
        for (int i = 0; i < elements.size(); i++) {
            System.out.printf("%s ", elements.get(i));
        }
        System.out.println();
        System.out.println("-------------");
        elements.add(3, "Spinner");
        elements.remove(1);
        elements.set(4, "Switch");
        for (String item : elements) {
            System.out.printf("%s ", item);
        }
    }

}
