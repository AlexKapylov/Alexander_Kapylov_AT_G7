package homework.day12;

import homework.day10.objects.Water;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {

    public static void main(String[] args) {
        Stream<Water> water = Stream.of(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"), new Water("Синяя", "Мятный"));
        System.out.println(water.filter(w -> !w.getColor().equals("Прозрачная")).sorted((w1, w2) -> -w1.getSmell().compareTo(w2.getSmell())).map(w -> {
            return new Water(w.getColor(), w.getSmell().replace("ы", "ыы"));
        }).map(Water::getSmell).collect(Collectors.joining()).length());
    }

}
