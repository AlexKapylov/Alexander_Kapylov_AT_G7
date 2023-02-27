package homework.day6.playground.utils;

public class DirectionGenerator {

    public static String generateDirection() {
        int randomNumber = 1 + (int) (Math.random() * 39);
        String direction = "Hello";
        if (randomNumber >= 1 && randomNumber <= 9) {
            direction = "NORTH";
        }
        if (randomNumber >= 10 && randomNumber <= 19) {
            direction = "SOUTH";
        }
        if (randomNumber >= 20 && randomNumber <= 29) {
            direction = "WEST";
        }
        if (randomNumber >= 30 && randomNumber <= 39) {
            direction = "EAST";
        }
        return direction;
    }

}
