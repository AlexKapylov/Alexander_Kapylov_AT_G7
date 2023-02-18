package basetask;

public class TrainMethodsObjectsRunner {


    public static void main(String[] args) {

        TrainMethodsObjects tmo = new TrainMethodsObjects();
        tmo.processMouse(new Mouse("мышка", 100));
        System.out.println("------------------------------------------------------");
        tmo.processSouce(new Souce("кетчуп", "красного"));
        System.out.println("------------------------------------------------------");
        tmo.processBee(new Bee("female", 100));
        System.out.println("------------------------------------------------------");
        tmo.processObstacle(new Obstacle("база дропнулась", "ASAP"));
        System.out.println("------------------------------------------------------");
        tmo.processPineapple(new Pineapple("неизвестный", 170.001));
    }

}
