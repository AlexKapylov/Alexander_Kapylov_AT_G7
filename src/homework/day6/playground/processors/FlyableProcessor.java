package homework.day6.playground.processors;

import homework.day6.playground.essence.Flyable;
import homework.day6.playground.essence.craft.air.Plane;
import homework.day6.playground.utils.DirectionGenerator;

public class FlyableProcessor {

    public void runFlyable(Flyable flyable) {
        runFlyable(flyable, DirectionGenerator.generateDirection());
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }

}
