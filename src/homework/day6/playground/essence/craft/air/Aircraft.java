package homework.day6.playground.essence.craft.air;

import homework.day6.playground.essence.Flyable;
import homework.day6.playground.essence.Matter;
import homework.day6.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {

    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", this.getClass().getSimpleName(), this.name, direction).println("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and I am moving from point %s to point %s", this.getClass().getSimpleName(), this.name, pointA, pointB).println("");
        return Math.abs(pointB - pointA);
    }
}
