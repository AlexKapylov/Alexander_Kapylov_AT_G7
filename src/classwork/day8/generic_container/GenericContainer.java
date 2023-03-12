package classwork.day8.generic_container;

public class GenericContainer<T> {

    private T[] objectsArray = (T[]) new Object[10];
    int objectCounter = 0;

    public void add(T incoming) {
        if (objectCounter < objectsArray.length) {
            objectsArray[objectCounter++] = incoming;
        } else {
            System.out.println("Нет места в массиве");
        }
    }

    public T removeLast() {
        T removedObject = null;
        if (objectCounter != 0) {
            removedObject = objectsArray[objectCounter - 1];
            objectsArray[objectCounter-- - 1] = null;
        }
        return removedObject;
    }

    public boolean isEmpty() {
        return objectCounter == 0;
    }

}
