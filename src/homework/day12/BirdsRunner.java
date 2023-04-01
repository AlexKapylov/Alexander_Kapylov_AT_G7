package homework.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {

    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        Arrays.stream(birds.stream().map(b -> b.replace("о", "а")).collect(Collectors.joining()).toLowerCase().replace("ь", "")
                .split("б")).map(b -> b.substring(0, 1).toUpperCase() + b.substring(1)).forEach(b -> System.out.printf("--%s--\n", b));
    }

}
