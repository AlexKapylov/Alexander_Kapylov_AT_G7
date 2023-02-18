package basetask;

public class TrainMethodsObjects {

    public void processMouse(Mouse myMouse) {

        System.out.println(myMouse.getName());
        System.out.println(myMouse.getAge());
        myMouse.printMouseDetails();

    }

    public void processSouce(Souce mySouce) {

        System.out.println(mySouce.getName());
        System.out.println(mySouce.getColor());
        mySouce.printSouceDetails();

    }

    public void processBee(Bee myBee) {

        System.out.println(myBee.getGender());
        System.out.println(myBee.getWeight());
        myBee.printBeeDetails();

    }

    public void processObstacle(Obstacle myObstacle) {

        System.out.println(myObstacle.getDescription());
        System.out.println(myObstacle.getSeverity());
        myObstacle.printObstacleDetails();

    }

    public void processPineapple(Pineapple myPineapple) {

        System.out.println(myPineapple.getGrade());
        System.out.println(myPineapple.getHeatCapacity());
        myPineapple.printPineappleDetails();

    }

}
