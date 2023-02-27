package homework.day6.playground.essence.craft.air;

import homework.day6.playground.essence.Flyable;
import homework.day6.playground.essence.Matter;
import homework.day6.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Flyable, Transportable {

    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
