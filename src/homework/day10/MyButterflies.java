package homework.day10;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MyButterflies {

    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
        for (String item : butterflies) {
            System.out.printf("\"%s\"", item).println();
        }
        System.out.println("-------------");
        int counter = 0;
        for (String item : butterflies) {
            if (item.contains("o")) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println("-------------");
        for (int i = 0; i < butterflies.size(); i++) {
            System.out.printf("%s ", butterflies.get(i));
        }
        System.out.println();
        System.out.println("-------------");
        for (String item : butterflies) {
            System.out.printf("%s\n", item);
        }
    }

}
