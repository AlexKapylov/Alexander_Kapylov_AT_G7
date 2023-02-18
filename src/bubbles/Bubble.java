package bubbles;

public class Bubble {

    double volume = 0.3;
    String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public Bubble() {

    }

    public void cramp() {
        System.out.println("Cramp!");
    }

}
