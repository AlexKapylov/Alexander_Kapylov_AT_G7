package homework.day10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MyFigures {

    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        try (FileWriter fw = new FileWriter("figures.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            for (String item : figures) {
                bw.write("- " + item + " ");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("IOException\nНеудачная или прерванная операция записи");
        }
        int counter = 0;
        for (String item : figures) {
            if (!item.contains("и")) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println("-------------");
        for (int i = 0; i < figures.size(); i++) {
            System.out.printf("%s ", figures.get(i));
        }
        System.out.println();
        System.out.println("-------------");
        try {
            figures.add(2, "Треугольник");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException\nЗапрошенная операция не поддерживается");
        }
        System.out.println("-------------");
        for (String item : figures) {
            System.out.printf("%s ", item);
        }
    }

}
