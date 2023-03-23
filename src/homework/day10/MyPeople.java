package homework.day10;

import homework.day10.objects.Person;

import java.util.ArrayList;
import java.util.List;

public class MyPeople {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));
        for (Person item : people) {
            System.out.printf("%s ", item.getAge());
        }
        System.out.println();
        System.out.println("-------------");
        for (Person item : people) {
            System.out.printf("%s ", item.getName());
        }
        System.out.println();
        System.out.println("-------------");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }

}
