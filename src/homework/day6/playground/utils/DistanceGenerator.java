package homework.day6.playground.utils;

public class DistanceGenerator {

    public static int generateDistance() {
        int randomDistance = 1 + (int) (Math.random() * 99);
        System.out.printf("DistanceGenerator: I have generated distance with value: %s", randomDistance).println();
        return randomDistance;
    }

}
