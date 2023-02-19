package bubbles;

public class Bottle {

    double bottleVolume;
    SparklingWater bottleWater;

    public void open() {
        bottleWater.degas();
    }


    public Bottle(double bottleVolume, String gas) {
        this.bottleVolume = bottleVolume;
        this.bottleWater = new SparklingWater(bottleVolume, gas);
    }

}
