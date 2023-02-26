package homework.day6.playground.essence.creatures;

public abstract class Vertebrata extends Animal {

    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect food) {
        System.out.printf("I am %s and I am eating %s", this.name, food.name);
    }

}
