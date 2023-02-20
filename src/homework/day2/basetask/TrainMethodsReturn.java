package homework.day2.basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int varInt) {
        return varInt * 3;
    }

    public long returnNewLong(long varLong) {
        return varLong - 4;
    }

    public String returnNewChar(char varChar) {
        return String.valueOf(varChar) + varChar;
    }

    public float returnNewFloat(float varFloat) {
        return varFloat / 2;
    }

    public double returnNewDouble(double varDouble) {
        return varDouble + 8;
    }

    public short returnNewShort(short varShort) {
        varShort = (short) (varShort - 1);
        return varShort;
    }

    public byte returnNewByte(byte varByte) {
        varByte = (byte) (varByte * 2);
        return varByte;
    }

    public boolean returnNewBoolean(Boolean varBoolean) {
        return !varBoolean;
    }

}
