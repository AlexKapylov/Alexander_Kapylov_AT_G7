package basetask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {
        TrainMethodsReturn tmr = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + tmr.returnNewInt(3));
        System.out.println("метод returnNewLong вернул " + tmr.returnNewLong(104));
        System.out.println("метод returnNewChar вернул " + tmr.returnNewChar('a'));
        System.out.println("метод returnNewFloat вернул " + tmr.returnNewFloat(2.4F));
        System.out.println("метод returnNewDouble вернул " + tmr.returnNewDouble(2.4));
        System.out.println("метод returnNewShort вернул " + tmr.returnNewShort((short) 2));
        System.out.println("метод returnNewByte вернул " + tmr.returnNewByte((byte) 2));
        System.out.println("метод returnNewBoolean вернул " + tmr.returnNewBoolean(true));
    }

}
