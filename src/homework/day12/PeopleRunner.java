package homework.day12;

import homework.day10.objects.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class PeopleRunner {

    public static void main(String[] args) {
        Stream<Person> people = Stream.of(new Person(32, "Коля"), new Person(24, "Оля"), new Person(55, "Вася"), new Person(63, "Маша"));
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("averageAge.txt"))) {
            bw.write(String.valueOf(people.filter(p -> p.getAge() < 60).sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).map(p -> {
                return new Person(p.getAge() + 4, p.getName());
            }).mapToInt(Person::getAge).average()));
        } catch (IOException e) {
            System.out.println("IOException\nНеудачная или прерванная операция записи");
        }
    }

}
