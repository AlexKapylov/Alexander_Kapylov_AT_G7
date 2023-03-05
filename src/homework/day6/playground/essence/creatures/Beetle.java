package homework.day6.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {

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

    @Override
    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %s units",
                this.getClass().getSimpleName(), this.name, direction, distance).println();
        System.out.println("vz-vz-vzz-zz..");
    }
}
