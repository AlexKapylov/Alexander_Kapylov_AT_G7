package classwork.day8.ConstantContainer;

public class ConstantContainerRunner {

    public static void main(String[] args) {
        ConstantContainer myContainer = new ConstantContainer();
        Printer myPrinter = new Printer();
        myPrinter.printColor("blue");
        myPrinter.printColor("red");
        myPrinter.printColor("green");
        myPrinter.printColor("yellow");
        myPrinter.printColor("purple");
    }

}
