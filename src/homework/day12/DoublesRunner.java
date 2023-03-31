package homework.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import homework.day10.objects.Bubble;

public class DoublesRunner {

    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        Random random = new Random();
        System.out.println(doubles.map(d -> (int) Math.round(d)).map(random::nextInt).distinct().map(d -> {
            List<Bubble> bubblesList = new ArrayList<>();
            for (int i = 0; i < d; i++) {
                bubblesList.add(new Bubble(d, "Bubble vol-" + d));
            }
            return bubblesList.stream();
        }).mapToInt(d -> d.peek(System.out::println).mapToInt(Bubble::getVolume).sum()).sum());
    }

}
