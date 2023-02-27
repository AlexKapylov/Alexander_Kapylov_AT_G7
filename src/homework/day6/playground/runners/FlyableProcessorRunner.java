package homework.day6.playground.runners;

import homework.day6.playground.essence.Flyable;
import homework.day6.playground.essence.craft.air.Aircraft;
import homework.day6.playground.essence.craft.air.Plane;
import homework.day6.playground.essence.craft.air.Copter;
import homework.day6.playground.essence.craft.air.Rocket;
import homework.day6.playground.essence.creatures.Fly;
import homework.day6.playground.essence.creatures.Insect;
import homework.day6.playground.essence.creatures.Mosquito;
import homework.day6.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {

    public static void main(String[] args) {
        FlyableProcessor myFlyableProcessor = new FlyableProcessor();
        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        myFlyableProcessor.runFlyable(flyableCopter);
        myFlyableProcessor.runFlyable(flyablePlane);
        myFlyableProcessor.runFlyable(flyableRocket);
        myFlyableProcessor.runFlyable(flyableFly);
        myFlyableProcessor.runFlyable(flyableMosquito);
        myFlyableProcessor.runFlyable(aircraftCopter);
        myFlyableProcessor.runFlyable(aircraftPlane);
        myFlyableProcessor.runFlyable(aircraftRocket);
        myFlyableProcessor.runFlyable((Flyable) insectFly);
        myFlyableProcessor.runFlyable((Flyable) insectMosquito);
        myFlyableProcessor.runFlyable(aCopter);
        myFlyableProcessor.runFlyable(aPlane);
        myFlyableProcessor.runFlyable(aRocket);
        myFlyableProcessor.runFlyable(aFly);
        myFlyableProcessor.runFlyable(aMosquito);
        System.out.println("-----------------------------");
        myFlyableProcessor.runFlyable(flyableCopter, "никуда");
        myFlyableProcessor.runFlyable(flyablePlane, "повсюду");
    }

}
