package homework.day8.generics;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T incomingArg) {
        System.out.printf("I am an object of %s class", incomingArg.getClass().getSimpleName()).println();
    }

    public String genericMethodTwoGenArgs(T firstArg, T secondArg) {
        return ("We are objects of " + firstArg.getClass().getSimpleName() + " class and " + secondArg.getClass().getSimpleName() + " class");
    }

    public void genericMethodHalfGenArgs(T firstArg, String secondArg) {
        System.out.printf("I got an object of %s class and string with %s characters",
                firstArg.getClass().getSimpleName(), secondArg.length()).println();
    }

}
