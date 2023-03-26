package classwork.day12.task3;

import homework.day11.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyTask3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split(""))).peek(System.out::println).max(String::compareTo).get());
        System.out.println(people.stream().min(Comparator.comparingInt(p -> p.age)).get());
    }

}
