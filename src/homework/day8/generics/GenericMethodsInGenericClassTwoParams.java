package homework.day8.generics;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(X incomingArg) {
        return new String("I received 1 argument of type: " + incomingArg.getClass().getSimpleName() + " class");
    }

    public String genericMethodGenArgs(X firstArg, Y secondArg) {
        return new String("I received 2 arguments of type: " + firstArg.getClass().getSimpleName()
                + " class, " + secondArg.getClass().getSimpleName() + " class");
    }

    public void genericMethodHalfGenArgs(X firstArg, String secondArg) {
        System.out.printf("I got an object of %s class and string with %s characters",
                firstArg.getClass().getSimpleName(), secondArg.length()).println();
    }

    public void genericMethodHalfGenArgs(String firstArg, Y secondArg) {
        System.out.printf("I got an object of %s class and string with %s characters",
                secondArg.getClass().getSimpleName(), firstArg.length()).println();
    }

    public void genericMethodHalfGenArgs(X firstArg, Y secondArg, String thirdArg) {
        System.out.printf("I got an object of %s class and %s class and string with %s characters",
                firstArg.getClass().getSimpleName(), secondArg.getClass().getSimpleName(), thirdArg.length()).println();
    }

}
