package project.boxing;

import project.liquid.SparklingWater;

public class Bottle {

    private double bottleVolume;
    private SparklingWater bottleWater;

    public void open() {
        bottleWater.degas();
    }


    public Bottle(double bottleVolume, String gas) {
        this.bottleVolume = bottleVolume;
        this.bottleWater = new SparklingWater(bottleVolume, gas);
    }

    public double getBottleVolume() {
        return bottleVolume;
    }

    public SparklingWater getBottleWater() {
        return bottleWater;
    }

    public void setBottleVolume(double bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    public void setBottleWater(SparklingWater bottleWater) {
        this.bottleWater = bottleWater;
    }
}
