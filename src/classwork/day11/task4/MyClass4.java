package classwork.day11.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass4 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().findFirst().orElse("мама"));
        System.out.println(list.stream().filter("мама"::equals).findFirst().get());
        System.out.println(list.stream().skip(4).findFirst().get());
        System.out.println(list.stream().skip(2).limit(2).collect(Collectors.toList()));
        System.out.println(list.stream().distinct().filter(s -> s.contains("м")).collect(Collectors.toList()));
    }

}
