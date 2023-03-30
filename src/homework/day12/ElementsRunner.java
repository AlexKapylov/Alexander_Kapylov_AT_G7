package homework.day12;

import java.util.stream.Stream;

public class ElementsRunner {

    public static void main(String[] args) {
        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        final int[] counter = {1};
        elements.map(e -> {
            if (counter[0] % 2 == 0) {
                String[] charArray = e.split("");
                int charCounter = 0;
                for (String item : charArray) {
                    if (item.matches("[a-zA-Zа-яА-Я]")) {
                        charCounter++;
                    }
                }
                e = String.valueOf(charCounter);
            } else {
                e = e.replace("e", "o");
            }
            counter[0]++;
            return e;
        }).distinct().forEach(System.out::println);
    }

}
