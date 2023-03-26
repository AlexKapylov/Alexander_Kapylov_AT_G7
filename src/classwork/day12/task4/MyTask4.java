package classwork.day12.task4;

import java.util.Arrays;
import java.util.List;

public class MyTask4 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split(""))).count());
    }

}
