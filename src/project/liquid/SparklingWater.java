package project.liquid;

import project.bubbles.Bubble;

public class SparklingWater extends Water {

    private Bubble[] bubbles;
    private boolean isOpened;
    public SparklingWater() {
        this.isOpened();
    }

    private void pump(Bubble[] bubbles) {
        this.setBubbles(this.getBubbles());
        Bubble myBubble = new Bubble("bubbleGas");
        int i = 0;
        while (i < bubbles.length) {
            bubbles[i++] = myBubble;
        }
    }

    private void degas() throws InterruptedException {
        int i;
        int j=1;
        for (i = 0; i < bubbles.length; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
            if((j==10+5*this.getTemperature())){
                Thread.sleep(1000);
            }
            j++;
        }
    }
    public boolean isSparkle(){
        boolean varSparkle=false;
        int i;
        for (i = 0; i < bubbles.length; i++) {
            if(bubbles[i]==null){
                continue;
            }else{
                varSparkle=true;
                break;
            }
        }
        return varSparkle;
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }
    private void isOpened(){
//        не понимаю как здесь запустить в отдельно потоке
//        int i;
//        for(i=1;i>0;i++){
//            if(isOpened){
//                this.degas();
//                break;
//            }
//        }
    }
}
