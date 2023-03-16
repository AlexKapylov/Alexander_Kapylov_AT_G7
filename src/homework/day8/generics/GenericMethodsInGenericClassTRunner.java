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

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> myString = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> myInteger = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> myDouble = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Aircraft> myAircraft = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> myCopter = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plane> myPlane = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> myRocket = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> myCar = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> myMoped = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> myMotorbike = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vehicle> myVehicle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Bottle> myBottle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> myCan = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Container> myContainer = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> myMug = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Storable> myStorable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rideable> myRideable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Transportable> myTransportable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Animal> myAnimal = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Beetle> myBeetle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> myCarrot = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> myChamomile = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crawlable> myCrawlable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> myCrocodile = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Flower> myFlower = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> myFly = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Insect> myInsect = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> myMaylily = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> myMosquito = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> myPigeon = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plant> myPlant = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> myPotato = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Radish> myRadish = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> myRaven = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> myRose = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vegetable> myVegetable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vertebrata> myVertebrata = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Diesel> myDiesel = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> myPetrol = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pourable> myPourable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Powerable> myPowerable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> myWater = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Flyable> myFlyable = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Matter> myMatter = new GenericMethodsInGenericClassT<>();

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

        myString.genericMethodOneGenArg("myString");
        System.out.println(myString.genericMethodTwoGenArgs("myString", "myString"));
        myString.genericMethodHalfGenArgs("myString", "myString");
        myInteger.genericMethodOneGenArg(1);
        System.out.println(myInteger.genericMethodTwoGenArgs(1, 1));
        myInteger.genericMethodHalfGenArgs(1, "myInteger");
        myDouble.genericMethodOneGenArg(1.5);
        System.out.println(myDouble.genericMethodTwoGenArgs(1.5, 1.5));
        myDouble.genericMethodHalfGenArgs(1.5, "myDouble");
        myAircraft.genericMethodOneGenArg(objectAircraft);
        System.out.println(myAircraft.genericMethodTwoGenArgs(objectAircraft, objectAircraft));
        myAircraft.genericMethodHalfGenArgs(objectAircraft, "myAircraft");
        myCopter.genericMethodOneGenArg(objectCopter);
        System.out.println(myCopter.genericMethodTwoGenArgs(objectCopter, objectCopter));
        myCopter.genericMethodHalfGenArgs(objectCopter, "myCopter");
        myPlane.genericMethodOneGenArg(objectPlane);
        System.out.println(myPlane.genericMethodTwoGenArgs(objectPlane, objectPlane));
        myPlane.genericMethodHalfGenArgs(objectPlane, "myPlane");
        myRocket.genericMethodOneGenArg(objectRocket);
        System.out.println(myRocket.genericMethodTwoGenArgs(objectRocket, objectRocket));
        myRocket.genericMethodHalfGenArgs(objectRocket, "myRocket");
        myCar.genericMethodOneGenArg(objectCar);
        System.out.println(myCar.genericMethodTwoGenArgs(objectCar, objectCar));
        myCar.genericMethodHalfGenArgs(objectCar, "myCar");
        myMoped.genericMethodOneGenArg(objectMoped);
        System.out.println(myMoped.genericMethodTwoGenArgs(objectMoped, objectMoped));
        myMoped.genericMethodHalfGenArgs(objectMoped, "myMoped");
        myMotorbike.genericMethodOneGenArg(objectMotorbike);
        System.out.println(myMotorbike.genericMethodTwoGenArgs(objectMotorbike, objectMotorbike));
        myMotorbike.genericMethodHalfGenArgs(objectMotorbike, "myMotorbike");
        myVehicle.genericMethodOneGenArg(objectVehicle);
        System.out.println(myVehicle.genericMethodTwoGenArgs(objectVehicle, objectVehicle));
        myVehicle.genericMethodHalfGenArgs(objectVehicle, "myVehicle");
        myBottle.genericMethodOneGenArg(objectBottle);
        System.out.println(myBottle.genericMethodTwoGenArgs(objectBottle, objectBottle));
        myBottle.genericMethodHalfGenArgs(objectBottle, "myBottle");
        myCan.genericMethodOneGenArg(objectCan);
        System.out.println(myCan.genericMethodTwoGenArgs(objectCan, objectCan));
        myCan.genericMethodHalfGenArgs(objectCan, "myCan");
        myContainer.genericMethodOneGenArg(objectContainer);
        System.out.println(myContainer.genericMethodTwoGenArgs(objectContainer, objectContainer));
        myContainer.genericMethodHalfGenArgs(objectContainer, "myContainer");
        myMug.genericMethodOneGenArg(objectMug);
        System.out.println(myMug.genericMethodTwoGenArgs(objectMug, objectMug));
        myMug.genericMethodHalfGenArgs(objectMug, "myMug");
        myStorable.genericMethodOneGenArg(objectStorable);
        System.out.println(myStorable.genericMethodTwoGenArgs(objectStorable, objectStorable));
        myStorable.genericMethodHalfGenArgs(objectStorable, "myStorable");
        myRideable.genericMethodOneGenArg(objectRideable);
        System.out.println(myRideable.genericMethodTwoGenArgs(objectRideable, objectRideable));
        myRideable.genericMethodHalfGenArgs(objectRideable, "myRideable");
        myTransportable.genericMethodOneGenArg(objectTransportable);
        System.out.println(myTransportable.genericMethodTwoGenArgs(objectTransportable, objectTransportable));
        myTransportable.genericMethodHalfGenArgs(objectTransportable, "myTransportable");
        myAnimal.genericMethodOneGenArg(objectAnimal);
        System.out.println(myAnimal.genericMethodTwoGenArgs(objectAnimal, objectAnimal));
        myAnimal.genericMethodHalfGenArgs(objectAnimal, "myAnimal");
        myBeetle.genericMethodOneGenArg(objectBeetle);
        System.out.println(myBeetle.genericMethodTwoGenArgs(objectBeetle, objectBeetle));
        myBeetle.genericMethodHalfGenArgs(objectBeetle, "myBeetle");
        myCarrot.genericMethodOneGenArg(objectCarrot);
        System.out.println(myCarrot.genericMethodTwoGenArgs(objectCarrot, objectCarrot));
        myCarrot.genericMethodHalfGenArgs(objectCarrot, "myCarrot");
        myChamomile.genericMethodOneGenArg(objectChamomile);
        System.out.println(myChamomile.genericMethodTwoGenArgs(objectChamomile, objectChamomile));
        myChamomile.genericMethodHalfGenArgs(objectChamomile, "myChamomile");
        myCrawlable.genericMethodOneGenArg(objectCrawlable);
        System.out.println(myCrawlable.genericMethodTwoGenArgs(objectCrawlable, objectCrawlable));
        myCrawlable.genericMethodHalfGenArgs(objectCrawlable, "myCrawlable");
        myCrocodile.genericMethodOneGenArg(objectCrocodile);
        System.out.println(myCrocodile.genericMethodTwoGenArgs(objectCrocodile, objectCrocodile));
        myCrocodile.genericMethodHalfGenArgs(objectCrocodile, "myCrocodile");
        myFlower.genericMethodOneGenArg(objectFlower);
        System.out.println(myFlower.genericMethodTwoGenArgs(objectFlower, objectFlower));
        myFlower.genericMethodHalfGenArgs(objectFlower, "myFlower");
        myFly.genericMethodOneGenArg(objectFly);
        System.out.println(myFly.genericMethodTwoGenArgs(objectFly, objectFly));
        myFly.genericMethodHalfGenArgs(objectFly, "myFly");
        myInsect.genericMethodOneGenArg(objectInsect);
        System.out.println(myInsect.genericMethodTwoGenArgs(objectInsect, objectInsect));
        myInsect.genericMethodHalfGenArgs(objectInsect, "myInsect");
        myMaylily.genericMethodOneGenArg(objectMaylily);
        System.out.println(myMaylily.genericMethodTwoGenArgs(objectMaylily, objectMaylily));
        myMaylily.genericMethodHalfGenArgs(objectMaylily, "myMaylily");
        myMosquito.genericMethodOneGenArg(objectMosquito);
        System.out.println(myMosquito.genericMethodTwoGenArgs(objectMosquito, objectMosquito));
        myMosquito.genericMethodHalfGenArgs(objectMosquito, "myMosquito");
        myPigeon.genericMethodOneGenArg(objectPigeon);
        System.out.println(myPigeon.genericMethodTwoGenArgs(objectPigeon, objectPigeon));
        myPigeon.genericMethodHalfGenArgs(objectPigeon, "myPigeon");
        myPlant.genericMethodOneGenArg(objectPlant);
        System.out.println(myPlant.genericMethodTwoGenArgs(objectPlant, objectPlant));
        myPlant.genericMethodHalfGenArgs(objectPlant, "myPlant");
        myPotato.genericMethodOneGenArg(objectPotato);
        System.out.println(myPotato.genericMethodTwoGenArgs(objectPotato, objectPotato));
        myPotato.genericMethodHalfGenArgs(objectPotato, "myPotato");
        myRadish.genericMethodOneGenArg(objectRadish);
        System.out.println(myRadish.genericMethodTwoGenArgs(objectRadish, objectRadish));
        myRadish.genericMethodHalfGenArgs(objectRadish, "myRadish");
        myRaven.genericMethodOneGenArg(objectRaven);
        System.out.println(myRaven.genericMethodTwoGenArgs(objectRaven, objectRaven));
        myRaven.genericMethodHalfGenArgs(objectRaven, "myRaven");
        myRose.genericMethodOneGenArg(objectRose);
        System.out.println(myRose.genericMethodTwoGenArgs(objectRose, objectRose));
        myRose.genericMethodHalfGenArgs(objectRose, "myRose");
        myVegetable.genericMethodOneGenArg(objectVegetable);
        System.out.println(myVegetable.genericMethodTwoGenArgs(objectVegetable, objectVegetable));
        myVegetable.genericMethodHalfGenArgs(objectVegetable, "myVegetable");
        myVertebrata.genericMethodOneGenArg(objectVertebrata);
        System.out.println(myVertebrata.genericMethodTwoGenArgs(objectVertebrata, objectVertebrata));
        myVertebrata.genericMethodHalfGenArgs(objectVertebrata, "myVertebrata");
        myDiesel.genericMethodOneGenArg(objectDiesel);
        System.out.println(myDiesel.genericMethodTwoGenArgs(objectDiesel, objectDiesel));
        myDiesel.genericMethodHalfGenArgs(objectDiesel, "myDiesel");
        myPetrol.genericMethodOneGenArg(objectPetrol);
        System.out.println(myPetrol.genericMethodTwoGenArgs(objectPetrol, objectPetrol));
        myPetrol.genericMethodHalfGenArgs(objectPetrol, "myPetrol");
        myPourable.genericMethodOneGenArg(objectPourable);
        System.out.println(myPourable.genericMethodTwoGenArgs(objectPourable, objectPourable));
        myPourable.genericMethodHalfGenArgs(objectPourable, "myPourable");
        myPowerable.genericMethodOneGenArg(objectPowerable);
        System.out.println(myPowerable.genericMethodTwoGenArgs(objectPowerable, objectPowerable));
        myPowerable.genericMethodHalfGenArgs(objectPowerable, "myPowerable");
        myWater.genericMethodOneGenArg(objectWater);
        System.out.println(myWater.genericMethodTwoGenArgs(objectWater, objectWater));
        myWater.genericMethodHalfGenArgs(objectWater, "myWater");
        myFlyable.genericMethodOneGenArg(objectFlyable);
        System.out.println(myFlyable.genericMethodTwoGenArgs(objectFlyable, objectFlyable));
        myFlyable.genericMethodHalfGenArgs(objectFlyable, "myFlyable");
        myMatter.genericMethodOneGenArg(objectMatter);
        System.out.println(myMatter.genericMethodTwoGenArgs(objectMatter, objectMatter));
        myMatter.genericMethodHalfGenArgs(objectMatter, "myMatter");
    }

}
