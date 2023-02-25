package project.runner;

import project.boxing.Bottle;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        Bottle myBottle1 = new Bottle(0.5);
        Bottle myBottle2 = new Bottle(1);
        Bottle myBottle3 = new Bottle(1.5);
        myBottle1.open();
        myBottle2.open();
        myBottle3.open();
    }

}
