package project.Runner;

import project.boxing.Bottle;

public class Runner {

    public static void main(String[] args) {
        Bottle myBottle1 = new Bottle(0.5, "o2");
        Bottle myBottle2 = new Bottle(1, "co");
        Bottle myBottle3 = new Bottle(1.5, "no");
        myBottle1.open();
        myBottle2.open();
        myBottle3.open();
    }

}
