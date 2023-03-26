package classwork.day12.task2;

import homework.day11.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyTask2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted((s, y) -> -s.compareTo(y)).distinct().collect(Collectors.toList()));
        System.out.println(people.stream().sorted((s, y) -> {
            if (s.sex.equals(y.sex)) {
                return s.age - y.age;
            } else {
                return (s.sex.compareTo(y.sex));
            }
        }).peek(System.out::println).collect(Collectors.toList()));
    }

}
