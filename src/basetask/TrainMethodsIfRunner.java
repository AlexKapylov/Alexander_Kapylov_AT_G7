package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf tmi = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул " + tmi.returnNewInt(8));
        System.out.println("метод returnNewLong вернул " + tmi.returnNewLong(301));
        System.out.println("метод returnNewChar вернул " + tmi.returnNewChar('h'));
        System.out.println("метод returnNewFloat вернул " + tmi.returnNewFloat(0.66F));
        System.out.println("метод returnNewDouble вернул " + tmi.returnNewDouble(401));
        tmi.returnNewBoolean(false);
    }
}
