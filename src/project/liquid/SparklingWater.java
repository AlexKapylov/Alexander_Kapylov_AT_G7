package project.liquid;

import project.bubbles.Bubble;

public class SparklingWater extends Water {

    private Bubble[] bubbles;
    private double bubbleAmount;
    private String neededBubbleGas;

    private double calculateBubbleAmount(double volume) {
        return volume * 10000;
    }

    public SparklingWater(double volume, String gas) {
        neededBubbleGas = gas;
        bubbleAmount = this.calculateBubbleAmount(volume);
        bubbles = new Bubble[(int) bubbleAmount];
        this.pump(bubbles);
    }

    private void pump(Bubble[] bubbles) {
        int i = 0;
        while (i < bubbles.length) {
            bubbles[i++] = new Bubble(neededBubbleGas);
        }
    }

    public void degas() {
        int i;
        for (i = 0; i < bubbleAmount; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
        }
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public double getBubbleAmount() {
        return bubbleAmount;
    }

    public String getNeededBubbleGas() {
        return neededBubbleGas;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setBubbleAmount(double bubbleAmount) {
        this.bubbleAmount = bubbleAmount;
    }

    public void setNeededBubbleGas(String neededBubbleGas) {
        this.neededBubbleGas = neededBubbleGas;
    }
}