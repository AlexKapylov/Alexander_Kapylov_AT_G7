package homework.day8.generics;

import homework.day6.playground.essence.Flyable;
import homework.day6.playground.essence.Matter;
import homework.day6.playground.essence.craft.Rideable;
import homework.day6.playground.essence.craft.Transportable;
import homework.day6.playground.essence.craft.air.*;
import homework.day6.playground.essence.craft.field.*;
import homework.day6.playground.essence.craft.hand.*;
import homework.day6.playground.essence.creatures.*;
import homework.day6.playground.essence.material.*;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> myStringString = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> myStringInteger = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> myStringDouble = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> myIntegerInteger = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Aircraft, Copter> myAircraftCopter = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plane, Rocket> myPlaneRocket = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Car, Moped> myCarMoped = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Motorbike, Vehicle> myMotorbikeVehicle = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Can> myBottleCan = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Container, Mug> myContainerMug = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Storable, Rideable> myStorableRideable = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Transportable, Animal> myTransportableAnimal = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Beetle, Carrot> myBeetleCarrot = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Chamomile, Crawlable> myChamomileCrawlable = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Flower> myCrocodileFlower = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Fly, Insect> myFlyInsect = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Maylily, Mosquito> myMaylilyMosquito = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pigeon, Plant> myPigeonPlant = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Potato, Radish> myPotatoRadish = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Raven, Rose> myRavenRose = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Vegetable, Vertebrata> myVegetableVertebrata = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Diesel, Petrol> myDieselPetrol = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pourable, Powerable> myPourablePowerable = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Water, Flyable> myWaterFlyable = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Matter, Flyable> myMatterFlyable = new GenericMethodsInGenericClassTwoParams<>();

        String objectString = "мама мыла раму";
        Integer objectInteger = 1;
        Double objectDouble = 1.5;
        Aircraft objectAircraft = new Aircraft(1, "myAircraft") {
        };
        Copter objectCopter = new Copter(1, "myCopter");
        Plane objectPlane = new Plane(1, "myPlane");
        Rocket objectRocket = new Rocket(1, "myRocket");
        Car objectCar = new Car(1, "myCar");
        Moped objectMoped = new Moped(1, "myMoped");
        Motorbike objectMotorbike = new Motorbike(1, "myMotorbike");
        Vehicle objectVehicle = new Vehicle(1, "myVehicle") {
        };
        Bottle objectBottle = new Bottle(1, "myBottle");
        Can objectCan = new Can(1, "myCan");
        Container objectContainer = new Container(1, "myContainer") {
        };
        Mug objectMug = new Mug(1, "myMug");
        Storable objectStorable = new Storable() {
        };
        Rideable objectRideable = new Rideable() {
            @Override
            public void drive(String direction) {
            }
        };
        Transportable objectTransportable = new Transportable() {
            @Override
            public int move(int pointA, int pointB) {
                return 0;
            }
        };
        Animal objectAnimal = new Animal(1, "myAnimal") {
        };
        Beetle objectBeetle = new Beetle(1, "myBeetle");
        Carrot objectCarrot = new Carrot(1, "myCarrot");
        Chamomile objectChamomile = new Chamomile(1, "myChamomile");
        Crawlable objectCrawlable = new Crawlable() {
            @Override
            public void crawl(String direction, int distance) {
            }
        };
        Crocodile objectCrocodile = new Crocodile(1, "myCrocodile");
        Flower objectFlower = new Flower(1, "myFlower") {
        };
        Fly objectFly = new Fly(1, "myFly");
        Insect objectInsect = new Insect(1, "myInsect") {
        };
        Maylily objectMaylily = new Maylily(1, "myMaylily");
        Mosquito objectMosquito = new Mosquito(1, "myMosquito");
        Pigeon objectPigeon = new Pigeon(1, "myPigeon");
        Plant objectPlant = new Plant(1, "myPlant") {
        };
        Potato objectPotato = new Potato(1, "myPotato");
        Radish objectRadish = new Radish(1, "myRadish");
        Raven objectRaven = new Raven(1, "myRaven");
        Rose objectRose = new Rose(1, "myRose");
        Vegetable objectVegetable = new Vegetable(1, "myVegetable") {
        };
        Vertebrata objectVertebrata = new Vertebrata(1, "myVertebrata") {
        };
        Diesel objectDiesel = new Diesel();
        Petrol objectPetrol = new Petrol();
        Pourable objectPourable = new Pourable() {
        };
        Powerable objectPowerable = new Powerable() {
        };
        Water objectWater = new Water();
        Flyable objectFlyable = new Flyable() {
            @Override
            public void fly(String direction) {
            }
        };
        Matter objectMatter = new Matter(1) {
        };

        System.out.println(myStringString.genericMethodGenArgs(objectString));
        System.out.println(myStringString.genericMethodGenArgs(objectString, objectString));
//        myStringString.genericMethodHalfGenArgs(objectString,objectString);
        myStringString.genericMethodHalfGenArgs(objectString, objectString, objectString);

        System.out.println(myStringInteger.genericMethodGenArgs(objectString));
        System.out.println(myStringInteger.genericMethodGenArgs(objectString, objectInteger));
        myStringInteger.genericMethodHalfGenArgs(objectString, objectString);
        myStringInteger.genericMethodHalfGenArgs(objectString, objectInteger);
        myStringInteger.genericMethodHalfGenArgs(objectString, objectInteger, objectString);

        System.out.println(myStringDouble.genericMethodGenArgs(objectString));
        System.out.println(myStringDouble.genericMethodGenArgs(objectString, objectDouble));
        myStringDouble.genericMethodHalfGenArgs(objectString, objectString);
        myStringDouble.genericMethodHalfGenArgs(objectString, objectDouble);
        myStringDouble.genericMethodHalfGenArgs(objectString, objectDouble, objectString);

        System.out.println(myIntegerInteger.genericMethodGenArgs(objectInteger));
        System.out.println(myIntegerInteger.genericMethodGenArgs(objectInteger, objectInteger));
        myIntegerInteger.genericMethodHalfGenArgs(objectInteger, objectString);
        myIntegerInteger.genericMethodHalfGenArgs(objectString, objectInteger);
        myIntegerInteger.genericMethodHalfGenArgs(objectInteger, objectInteger, objectString);

        System.out.println(myAircraftCopter.genericMethodGenArgs(objectAircraft));
        System.out.println(myAircraftCopter.genericMethodGenArgs(objectAircraft, objectCopter));
        myAircraftCopter.genericMethodHalfGenArgs(objectAircraft, objectString);
        myAircraftCopter.genericMethodHalfGenArgs(objectString, objectCopter);
        myAircraftCopter.genericMethodHalfGenArgs(objectAircraft, objectCopter, objectString);

        System.out.println(myPlaneRocket.genericMethodGenArgs(objectPlane));
        System.out.println(myPlaneRocket.genericMethodGenArgs(objectPlane, objectRocket));
        myPlaneRocket.genericMethodHalfGenArgs(objectPlane, objectString);
        myPlaneRocket.genericMethodHalfGenArgs(objectString, objectRocket);
        myPlaneRocket.genericMethodHalfGenArgs(objectPlane, objectRocket, objectString);

        System.out.println(myCarMoped.genericMethodGenArgs(objectCar));
        System.out.println(myCarMoped.genericMethodGenArgs(objectCar, objectMoped));
        myCarMoped.genericMethodHalfGenArgs(objectCar, objectString);
        myCarMoped.genericMethodHalfGenArgs(objectString, objectMoped);
        myCarMoped.genericMethodHalfGenArgs(objectCar, objectMoped, objectString);

        System.out.println(myMotorbikeVehicle.genericMethodGenArgs(objectMotorbike));
        System.out.println(myMotorbikeVehicle.genericMethodGenArgs(objectMotorbike, objectVehicle));
        myMotorbikeVehicle.genericMethodHalfGenArgs(objectMotorbike, objectString);
        myMotorbikeVehicle.genericMethodHalfGenArgs(objectString, objectVehicle);
        myMotorbikeVehicle.genericMethodHalfGenArgs(objectMotorbike, objectVehicle, objectString);

        System.out.println(myBottleCan.genericMethodGenArgs(objectBottle));
        System.out.println(myBottleCan.genericMethodGenArgs(objectBottle, objectCan));
        myBottleCan.genericMethodHalfGenArgs(objectBottle, objectString);
        myBottleCan.genericMethodHalfGenArgs(objectString, objectCan);
        myBottleCan.genericMethodHalfGenArgs(objectBottle, objectCan, objectString);

        System.out.println(myContainerMug.genericMethodGenArgs(objectContainer));
        System.out.println(myContainerMug.genericMethodGenArgs(objectContainer, objectMug));
        myContainerMug.genericMethodHalfGenArgs(objectContainer, objectString);
        myContainerMug.genericMethodHalfGenArgs(objectString, objectMug);
        myContainerMug.genericMethodHalfGenArgs(objectContainer, objectMug, objectString);

        System.out.println(myStorableRideable.genericMethodGenArgs(objectStorable));
        System.out.println(myStorableRideable.genericMethodGenArgs(objectStorable, objectRideable));
        myStorableRideable.genericMethodHalfGenArgs(objectStorable, objectString);
        myStorableRideable.genericMethodHalfGenArgs(objectString, objectRideable);
        myStorableRideable.genericMethodHalfGenArgs(objectStorable, objectRideable, objectString);

        System.out.println(myTransportableAnimal.genericMethodGenArgs(objectTransportable));
        System.out.println(myTransportableAnimal.genericMethodGenArgs(objectTransportable, objectAnimal));
        myTransportableAnimal.genericMethodHalfGenArgs(objectTransportable, objectString);
        myTransportableAnimal.genericMethodHalfGenArgs(objectString, objectAnimal);
        myTransportableAnimal.genericMethodHalfGenArgs(objectTransportable, objectAnimal, objectString);

        System.out.println(myBeetleCarrot.genericMethodGenArgs(objectBeetle));
        System.out.println(myBeetleCarrot.genericMethodGenArgs(objectBeetle, objectCarrot));
        myBeetleCarrot.genericMethodHalfGenArgs(objectBeetle, objectString);
        myBeetleCarrot.genericMethodHalfGenArgs(objectString, objectCarrot);
        myBeetleCarrot.genericMethodHalfGenArgs(objectBeetle, objectCarrot, objectString);

        System.out.println(myChamomileCrawlable.genericMethodGenArgs(objectChamomile));
        System.out.println(myChamomileCrawlable.genericMethodGenArgs(objectChamomile, objectCrawlable));
        myChamomileCrawlable.genericMethodHalfGenArgs(objectChamomile, objectString);
        myChamomileCrawlable.genericMethodHalfGenArgs(objectString, objectCrawlable);
        myChamomileCrawlable.genericMethodHalfGenArgs(objectChamomile, objectCrawlable, objectString);

        System.out.println(myCrocodileFlower.genericMethodGenArgs(objectCrocodile));
        System.out.println(myCrocodileFlower.genericMethodGenArgs(objectCrocodile, objectFlower));
        myCrocodileFlower.genericMethodHalfGenArgs(objectCrocodile, objectString);
        myCrocodileFlower.genericMethodHalfGenArgs(objectString, objectFlower);
        myCrocodileFlower.genericMethodHalfGenArgs(objectCrocodile, objectFlower, objectString);

        System.out.println(myFlyInsect.genericMethodGenArgs(objectFly));
        System.out.println(myFlyInsect.genericMethodGenArgs(objectFly, objectInsect));
        myFlyInsect.genericMethodHalfGenArgs(objectFly, objectString);
        myFlyInsect.genericMethodHalfGenArgs(objectString, objectInsect);
        myFlyInsect.genericMethodHalfGenArgs(objectFly, objectInsect, objectString);

        System.out.println(myMaylilyMosquito.genericMethodGenArgs(objectMaylily));
        System.out.println(myMaylilyMosquito.genericMethodGenArgs(objectMaylily, objectMosquito));
        myMaylilyMosquito.genericMethodHalfGenArgs(objectMaylily, objectString);
        myMaylilyMosquito.genericMethodHalfGenArgs(objectString, objectMosquito);
        myMaylilyMosquito.genericMethodHalfGenArgs(objectMaylily, objectMosquito, objectString);

        System.out.println(myPigeonPlant.genericMethodGenArgs(objectPigeon));
        System.out.println(myPigeonPlant.genericMethodGenArgs(objectPigeon, objectPlant));
        myPigeonPlant.genericMethodHalfGenArgs(objectPigeon, objectString);
        myPigeonPlant.genericMethodHalfGenArgs(objectString, objectPlant);
        myPigeonPlant.genericMethodHalfGenArgs(objectPigeon, objectPlant, objectString);

        System.out.println(myPotatoRadish.genericMethodGenArgs(objectPotato));
        System.out.println(myPotatoRadish.genericMethodGenArgs(objectPotato, objectRadish));
        myPotatoRadish.genericMethodHalfGenArgs(objectPotato, objectString);
        myPotatoRadish.genericMethodHalfGenArgs(objectString, objectRadish);
        myPotatoRadish.genericMethodHalfGenArgs(objectPotato, objectRadish, objectString);

        System.out.println(myRavenRose.genericMethodGenArgs(objectRaven));
        System.out.println(myRavenRose.genericMethodGenArgs(objectRaven, objectRose));
        myRavenRose.genericMethodHalfGenArgs(objectRaven, objectString);
        myRavenRose.genericMethodHalfGenArgs(objectString, objectRose);
        myRavenRose.genericMethodHalfGenArgs(objectRaven, objectRose, objectString);

        System.out.println(myVegetableVertebrata.genericMethodGenArgs(objectVegetable));
        System.out.println(myVegetableVertebrata.genericMethodGenArgs(objectVegetable, objectVertebrata));
        myVegetableVertebrata.genericMethodHalfGenArgs(objectVegetable, objectString);
        myVegetableVertebrata.genericMethodHalfGenArgs(objectString, objectVertebrata);
        myVegetableVertebrata.genericMethodHalfGenArgs(objectVegetable, objectVertebrata, objectString);

        System.out.println(myDieselPetrol.genericMethodGenArgs(objectDiesel));
        System.out.println(myDieselPetrol.genericMethodGenArgs(objectDiesel, objectPetrol));
        myDieselPetrol.genericMethodHalfGenArgs(objectDiesel, objectString);
        myDieselPetrol.genericMethodHalfGenArgs(objectString, objectPetrol);
        myDieselPetrol.genericMethodHalfGenArgs(objectDiesel, objectPetrol, objectString);

        System.out.println(myPourablePowerable.genericMethodGenArgs(objectPourable));
        System.out.println(myPourablePowerable.genericMethodGenArgs(objectPourable, objectPowerable));
        myPourablePowerable.genericMethodHalfGenArgs(objectPourable, objectString);
        myPourablePowerable.genericMethodHalfGenArgs(objectString, objectPowerable);
        myPourablePowerable.genericMethodHalfGenArgs(objectPourable, objectPowerable, objectString);

        System.out.println(myWaterFlyable.genericMethodGenArgs(objectWater));
        System.out.println(myWaterFlyable.genericMethodGenArgs(objectWater, objectFlyable));
        myWaterFlyable.genericMethodHalfGenArgs(objectWater, objectString);
        myWaterFlyable.genericMethodHalfGenArgs(objectString, objectFlyable);
        myWaterFlyable.genericMethodHalfGenArgs(objectWater, objectFlyable, objectString);

        System.out.println(myMatterFlyable.genericMethodGenArgs(objectMatter));
        System.out.println(myMatterFlyable.genericMethodGenArgs(objectMatter, objectFlyable));
        myMatterFlyable.genericMethodHalfGenArgs(objectMatter, objectString);
        myMatterFlyable.genericMethodHalfGenArgs(objectString, objectFlyable);
        myMatterFlyable.genericMethodHalfGenArgs(objectMatter, objectFlyable, objectString);
    }

}
