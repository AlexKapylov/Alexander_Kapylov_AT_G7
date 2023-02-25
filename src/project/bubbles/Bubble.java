package project.bubbles;

public class Bubble {

    private double volume = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public double getVolume() {
        return volume;
    }

    public String getGas() {
        return gas;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

}
