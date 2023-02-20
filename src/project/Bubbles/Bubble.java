package project.Bubbles;

public class Bubble {

    private double volume = 0.3;
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

    public double getVolume() {
        return volume;
    }

    public String getGasComposition() {
        return gasComposition;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setGasComposition(String gasComposition) {
        this.gasComposition = gasComposition;
    }
}
