package homework.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ButterfliesRunner {

    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
        butterflies.stream().map(b -> '"' + b + '"').flatMap(b -> Arrays.stream(b.split(" "))).filter(b -> b.contains("a") && b.contains("o")).forEach(System.out::println);
    }

}
