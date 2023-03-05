package homework.day6.playground.utils;

public class CoordinatesGenerator {

    public static int generateCoordinate() {
        int randomNumber = 1 + (int) (Math.random() * 79);
        System.out.printf("CoordinatesGenerator: I have generated point with value: %s", randomNumber).println();
        return randomNumber;
    }

}
