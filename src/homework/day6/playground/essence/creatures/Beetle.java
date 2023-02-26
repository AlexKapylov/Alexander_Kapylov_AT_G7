package homework.day6.playground.essence.creatures;

public class Beetle extends Insect {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (this.mass < home.getMass()) {
            System.out.printf("I am %s and I will nest there with %s my family members!", this.name, (home.getMass() / this.mass));
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }

}
