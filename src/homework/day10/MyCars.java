package homework.day10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyCars {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");
        try (FileWriter fw = new FileWriter("cars.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            for (String item : cars) {
                bw.write("- \"" + item + "\"\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("IOException\nНеудачная или прерванная операция записи");
        }
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).length() > 4) {
                cars.remove(i--);
            }
        }
        for (String item : cars) {
            System.out.printf("%s ", item);
        }
    }

}
