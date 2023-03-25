package homework.day11;

import java.util.Arrays;
import java.util.List;

public class MyPeople {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        int counter = 0;
        for (Person item : people) {
            if (item.age > 17 && item.age < 56 && item.sex == Person.Sex.WOMAN) {
                counter++;
            } else if (item.age > 17 && item.age < 61 && item.sex == Person.Sex.MAN) {
                counter++;
            }
        }
        System.out.printf("Потенциально работоспособные люди: %s (Без использования Stream API)", counter).println();
        System.out.printf("Потенциально работоспособные люди: %s (С использованием Stream API)",
                people.stream().filter(item -> item.age > 17 && item.age < 56 && item.sex == Person.Sex.WOMAN
                        || item.age > 17 && item.age < 61 && item.sex == Person.Sex.MAN).count());

    }

}
