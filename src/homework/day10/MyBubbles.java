package homework.day10;

import homework.day10.objects.Bubble;

import java.util.Arrays;
import java.util.List;

public class MyBubbles {

    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));
        for (Bubble item : bubbles) {
            System.out.printf("%s ", item.getVolume());
        }
        System.out.println();
        System.out.println("-------------");
        for (Bubble item : bubbles) {
            System.out.printf("%s ", item.getName());
        }
        System.out.println();
        System.out.println("-------------");
        int generalVolume = 0;
        for (Bubble item : bubbles) {
            generalVolume = generalVolume + item.getVolume();
        }
        System.out.println(generalVolume);
        System.out.println("-------------");
        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }

}
