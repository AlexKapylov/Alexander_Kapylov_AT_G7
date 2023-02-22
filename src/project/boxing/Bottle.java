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
        ((SparklingWater)water).setBottleBubbles(new Bubble[(int)this.volume*10000]);
    }
    public void open() {
        ((SparklingWater)this.water).setOpened(true);
    }
    public void warm(int temperature){
        this.water.setTemperature((temperature));
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

}
