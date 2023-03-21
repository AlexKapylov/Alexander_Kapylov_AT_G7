package homework.day10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        for (int item : numbers) {
            System.out.println(item);
        }
        System.out.println("-------------");
        int sum = 0;
        for (int item : numbers) {
            sum = sum + item;
        }
        System.out.println(sum);
        System.out.println("-------------");
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%s ", numbers.get(i));
        }
        System.out.println();
        System.out.println("-------------");
        Collections.reverse(numbers);
        for (int item : numbers) {
            System.out.printf("%s ", item);
        }
    }

}
