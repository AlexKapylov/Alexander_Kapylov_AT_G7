package classwork.day7.object_container;

public class ObjectContainerRunner {


    public static void main(String[] args) {
        ObjectContainer myContainer = new ObjectContainer();
        for (int i = 0; i < 10; i++) {
            myContainer.add(i);
        }
        while (!myContainer.isEmpty()) {
            System.out.printf("We had in container: %s", myContainer.removeLast()).println();
        }
    }

}
