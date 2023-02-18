package bubbles;

public class Bottle {

    double bottleVolume;
    SparklingWater bottleWater;

    public void open() {
        bottleWater.degas();
//        bottleWater.closeness=false;
    }

    public Bottle(double bottleVolume) {
        this.bottleVolume = bottleVolume;
        this.bottleWater = new SparklingWater(bottleVolume);
    }

    public Bottle(double bottleVolume, String gas) {
        this.bottleVolume = bottleVolume;
        this.bottleWater = new SparklingWater(bottleVolume, gas);
    }

}
