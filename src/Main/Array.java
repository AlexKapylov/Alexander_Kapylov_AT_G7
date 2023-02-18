package Main;

import java.util.Random;

public class Array {
    public void foo() {

        int[] array = new int[10];
        Random random = new Random();
        double sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
//        }
        for (int i : array) {
            i = random.nextInt(100);
            System.out.println(i);
            sum += i;
        }
        double avg = sum / array.length;
        System.out.println("Average value is: " + avg);

    }
}
