package homework.day10;

import java.util.Arrays;
import java.util.List;

public class MyDoubles {

    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        for (double item : doubles) {
            System.out.printf("%s ", item);
        }
        System.out.println();
        System.out.println("-------------");
        double product = 1;
        for (double item : doubles) {
            product = product * item;
        }
        System.out.println(product);
        System.out.println("-------------");
        double sum = 0;
        for (double item : doubles) {
            sum = sum + (item - (int) item);
        }
        System.out.println(sum);
        System.out.println("-------------");
        for (int i = 0; i < doubles.size(); i++) {
            System.out.printf("%s ", (int) Math.floor(doubles.get(i)));
        }
    }

}
