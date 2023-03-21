package homework.day10;

import java.util.Arrays;
import java.util.List;

public class MyBirds {

    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        for (String item : birds) {
            System.out.printf("--%s--", item).println();
        }
        System.out.println("-------------");
        int birdCounter = 0;
        for (String item : birds) {
            int vowelCounter = 0;
            char[] itemCharArray = item.toCharArray();
            char[] vowelArray = new char[]{'ё', 'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю', 'e', 'y', 'u', 'i', 'o', 'a'};
            for (int i = 0; i < itemCharArray.length; i++) {
                for (int j = 0; j < vowelArray.length; j++) {
                    if (itemCharArray[i] == vowelArray[j]) {
                        vowelCounter++;
                    }
                }
            }
            if (vowelCounter > 1) {
                birdCounter++;
            }
        }
        System.out.println(birdCounter);
        System.out.println("-------------");
        for (int i = 0; i < birds.size(); i++) {
            System.out.printf("%s ", birds.get(i));
        }
        System.out.println();
        try {
            birds.set(2, "Синица");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException\nЗапрошенная операция не поддерживается");
        }
        System.out.println("-------------");
        for (String item : birds) {
            System.out.printf("%s ", item);
        }
    }

}
