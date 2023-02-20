package basetask;

public class TrainMethodsIf {

    public int returnNewInt(int varInt) {
        if (varInt < 8) {
            return varInt * 7;
        }
        return varInt / 4;
    }

    public long returnNewLong(long varLong) {
        if (varLong > 300) {
            return varLong - 300;
        }
        return varLong + 20;
    }

    public String returnNewChar(char varChar) {
        if (varChar == 'g') {
            return "go";
        }
        return "o" + varChar;
    }

    public float returnNewFloat(float varFloat) {
        if (varFloat == 0.67F) {
            return varFloat;
        }
        return varFloat * 2;
    }

    public double returnNewDouble(double varDouble) {
        if (varDouble > 30 && varDouble < 80) {
            return varDouble + 87;
        }
        if (varDouble > 80 && varDouble < 400) {
            return varDouble - 87;
        }
        if (varDouble > 400) {
            return varDouble / 4;
        }
        return varDouble;
    }

    public void returnNewBoolean(boolean varBoolean) {
        if (varBoolean) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }

}
