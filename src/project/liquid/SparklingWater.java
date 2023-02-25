package project.liquid;

import project.bubbles.Bubble;

public class SparklingWater extends Water {

    private Bubble[] bubbles;
    private boolean isOpened;

    public SparklingWater() {
        this.isOpened();
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) throws InterruptedException {
        this.isOpened = isOpened;
        this.degas();
    }

    public void pump(Bubble[] myBubbles) {
        bubbles = myBubbles;
        for (int i = 0; i < bubbles.length; i++) {
            Bubble myBubble = new Bubble("bubbleGas");
            bubbles[i] = myBubble;
        }
    }

    private void degas() throws InterruptedException {
        int j = 1;
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
            if (j == 10 + 5 * this.getTemperature()) {
                Thread.sleep(1000);
            }
            j++;
        }
    }

    public boolean isSparkle() {
        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] != null) {
                return true;
            }
        }
        return false;
    }

    private void isOpened() {
//        for(int i=1;i>0;i++){
//            if(isOpened){
//                this.degas();
//                break;
//            }
//        }
    }
}
