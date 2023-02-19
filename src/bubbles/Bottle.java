package bubbles;

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

}
