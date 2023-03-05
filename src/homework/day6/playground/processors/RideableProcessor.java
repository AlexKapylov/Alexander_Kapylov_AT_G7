package homework.day6.playground.processors;

import homework.day6.playground.essence.craft.Rideable;
import homework.day6.playground.utils.DirectionGenerator;

public class RideableProcessor {

    public void runRideable(Rideable rideable) {
        runRideable(rideable, DirectionGenerator.generateDirection());
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }

}
