package homework.day12;

import java.util.stream.Stream;

public class ElementsRunner {

    public static void main(String[] args) {
        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        elements.map(e -> {
            String[] charArray = e.split("");
            int counter = 0;
            for (String item : charArray) {
                if (item.matches("[a-zA-Zа-яА-я]")) {
                    counter++;
                }
            }
            if (counter % 2 == 0) {
                e = String.valueOf(counter);
            } else {
                e = e.replace("e", "o");
            }
            return e;
        }).distinct().forEach(System.out::println);
    }

}
