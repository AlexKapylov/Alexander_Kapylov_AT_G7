package homework.day6.playground.runners;

import homework.day6.playground.essence.Flyable;
import homework.day6.playground.essence.craft.Rideable;
import homework.day6.playground.essence.craft.Transportable;
import homework.day6.playground.essence.craft.air.Aircraft;
import homework.day6.playground.essence.craft.air.Copter;
import homework.day6.playground.essence.craft.air.Plane;
import homework.day6.playground.essence.craft.air.Rocket;
import homework.day6.playground.essence.craft.field.Car;
import homework.day6.playground.essence.craft.field.Moped;
import homework.day6.playground.essence.craft.field.Motorbike;
import homework.day6.playground.essence.craft.field.Vehicle;
import homework.day6.playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {

    public static void main(String[] args) {
        TransportableProcessor myTransportableProcessor = new TransportableProcessor();
        Transportable transportableCopter = new Copter(223, "AW109 Transportable");
        Transportable transportablePlane = new Plane(3452, "Airbus a380 Transportable");
        Transportable transportableRocket = new Rocket(7623, "Soyuz-FG Transportable");
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");
        Aircraft aircraftCopter = new Copter(223, "AW109 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");
        Vehicle vehicleCar = new Car(23, "Tesla X Vehicle");
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");
        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");
        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");
        Copter aCopter = new Copter(223, "AW109 Copter");
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");
        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");
        myTransportableProcessor.runTransportable(transportableCopter);
        myTransportableProcessor.runTransportable(transportablePlane);
        myTransportableProcessor.runTransportable(transportableRocket);
        myTransportableProcessor.runTransportable(transportableCar);
        myTransportableProcessor.runTransportable(transportableMoped);
        myTransportableProcessor.runTransportable(transportableMotorbike);
        myTransportableProcessor.runTransportable(aircraftCopter);
        myTransportableProcessor.runTransportable(aircraftPlane);
        myTransportableProcessor.runTransportable(aircraftRocket);
        myTransportableProcessor.runTransportable(vehicleCar);
        myTransportableProcessor.runTransportable(vehicleMoped);
        myTransportableProcessor.runTransportable(vehicleMotorbike);
        myTransportableProcessor.runTransportable((Transportable) flyableCopter);
        myTransportableProcessor.runTransportable((Transportable) flyablePlane);
        myTransportableProcessor.runTransportable((Transportable) flyableRocket);
        myTransportableProcessor.runTransportable((Transportable) rideableCar);
        myTransportableProcessor.runTransportable((Transportable) rideableMoped);
        myTransportableProcessor.runTransportable((Transportable) rideableMotorbike);
        myTransportableProcessor.runTransportable(aCopter);
        myTransportableProcessor.runTransportable(aPlane);
        myTransportableProcessor.runTransportable(aRocket);
        myTransportableProcessor.runTransportable(aCar);
        myTransportableProcessor.runTransportable(aMoped);
        myTransportableProcessor.runTransportable(aMotorbike);
        System.out.println("-----------------------------");
        myTransportableProcessor.runTransportable(transportableCopter, 23, 242);
        myTransportableProcessor.runTransportable(transportablePlane, 93, 7);
    }

}
