package project.boxing;

import project.bubbles.Bubble;
import project.liquid.SparklingWater;
import project.liquid.Water;

public class Bottle {

    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
        this.water = new SparklingWater();
        ((SparklingWater) water).pump(new Bubble[(int) (volume * 10000)]);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void open() throws InterruptedException {
        ((SparklingWater) this.water).setOpened(true);
    }

    public void warm(int temperature) {
        this.water.setTemperature((temperature));
    }

}
