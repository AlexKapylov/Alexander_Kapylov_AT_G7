package bubbles;

public class SparklingWater extends Water implements Runnable {

    Bubble[] bubbles;
    double bubbleAmount;
    String bubbleGas;
    boolean closeness = true;
    double calculateBubbleAmount(double volume) {
        return volume * 10000;
    }

    public SparklingWater(double volume) {
        int i = 0;
        bubbleAmount = this.calculateBubbleAmount(volume);
        bubbles = new Bubble[(int) bubbleAmount];
        this.pump(bubbles);
//        new Thread(new SparklingWater(volume)).start();
    }
    public SparklingWater(double volume, String gas) {
        bubbleGas = gas;
        int i = 0;
        bubbleAmount = this.calculateBubbleAmount(volume);
        bubbles = new Bubble[(int) bubbleAmount];
        this.pumpWithGas(bubbles);
    }

    public void pump(Bubble[] bubbles) {
        int i = 0;
        while (i < bubbles.length) {
            bubbles[i] = new Bubble();
            i++;
        }
    }

    public void pumpWithGas(Bubble[] bubbles) {
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

    public void isOpened() throws InterruptedException {
        int i = 0;
        while (i >= 0) {
            if (closeness == true) {
                Thread.sleep(2000);
            } else {
                this.degas();
                break;
            }
        }
    }

    @Override
    public void run() {
        this.degas();
    }
}
