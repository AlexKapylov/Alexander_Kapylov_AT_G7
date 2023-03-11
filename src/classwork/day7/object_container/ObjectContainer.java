package classwork.day7.object_container;

public class ObjectContainer {
    Object[] objectsArray = new Object[10];
    int objectCounter = 0;

    public void add(Object incoming) {
        if (objectCounter < objectsArray.length) {
            objectsArray[objectCounter++] = incoming;
        } else {
            System.out.println("Нет места в массиве");
        }
    }

    public Object removeLast() {
        Object removedObject = null;
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
