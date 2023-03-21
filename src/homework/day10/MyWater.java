package homework.day10;

import homework.day10.objects.Water;

import java.util.Arrays;
import java.util.List;

public class MyWater {

    public static void main(String[] args) {
        List<Water> water = Arrays.asList(new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"));
        for (Water item : water) {
            System.out.printf("%s - %s", item.getColor(), item.getSmell()).println();
        }
    }

}
