package bubbles;

public class SparklingWater extends Water {

    private Bubble[] bubbles;
    private double bubbleAmount;
    private String bubbleGas;

    private double calculateBubbleAmount(double volume) {
        return volume * 10000;
    }

    public SparklingWater(double volume, String gas) {
        bubbleGas = gas;
        int i = 0;
        bubbleAmount = this.calculateBubbleAmount(volume);
        bubbles = new Bubble[(int) bubbleAmount];
        this.pump(bubbles);
    }

    private void pump(Bubble[] bubbles) {
        int i = 0;
        while (i < bubbles.length) {
            bubbles[i] = new Bubble(bubbleGas);
            i++;
        }
    }
    public void degas() {
        int i;
        for (i = 0; i < bubbleAmount; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
        }
    }
}
