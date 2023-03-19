package classwork.day10.colors;

import java.util.ArrayList;
import java.util.List;

public class MyColors {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        for (String item : colors) {
            System.out.printf("%s ", item);
        }
        System.out.println();
        colors.add(1, "Pink");
        colors.add(3, "Yellow");
        for (int i = 0; i < colors.size(); i++) {
            System.out.printf("%s ", colors.get(i));
        }
        System.out.println();
        System.out.printf("%s %s", colors.get(0), colors.get(4));
    }

}
