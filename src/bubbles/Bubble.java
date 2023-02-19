package bubbles;

public class Bubble {

    private double volume = 0.3;
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

}
