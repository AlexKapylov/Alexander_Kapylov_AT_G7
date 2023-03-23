package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class MyNoodles {

    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");
        for (String item : noodles) {
            if (item.equals(noodles.get(noodles.size() - 1))) {
                System.out.printf("%s", item);
            } else {
                System.out.printf("%s - ", item);
            }
        }
        System.out.println();
        System.out.println("-------------");
        for (int j = 0; j < noodles.size(); j++) {
            noodles.set(j, noodles.get(j).replace('a', 'o'));
        }
        for (int i = 0; i < noodles.size(); i++) {
            System.out.printf("%s ", noodles.get(i));
        }
    }

}
