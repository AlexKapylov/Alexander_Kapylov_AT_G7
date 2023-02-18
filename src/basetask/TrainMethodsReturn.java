package basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int x) {
        return x * 3;
    }

    public long returnNewLong(long x) {
        return x - 4;
    }

    public String returnNewChar(char x) {
        return String.valueOf(x) + x;
    }

    public float returnNewFloat(float x) {
        return x / 2;
    }

    public double returnNewDouble(double x) {
        return x + 8;
    }

    public short returnNewShort(short x) {
        x = (short) (x - 1);
        return x;
    }

    public byte returnNewByte(byte x) {
        x = (byte) (x * 2);
        return x;
    }

    public boolean returnNewBoolean(Boolean x) {
        return !x;
    }

}
