package basetask;

public class TrainMethodsIf {

    public int returnNewInt(int x) {
        if (x < 8) {
            return x * 7;
        }
        return x / 4;
    }

    public long returnNewLong(long x) {
        if (x > 300) {
            return x - 300;
        }
        return x + 20;
    }

    public String returnNewChar(char x) {
        if (x == 'g') {
            return "go";
        }
        return "o" + x;
    }

    public float returnNewFloat(float x) {
        if (x == 0.67F) {
            return x;
        }
        return x * 2;
    }

    public double returnNewDouble(double x) {
        if (x > 30 && x < 80) {
            return x + 87;
        }
        if (x > 80 && x < 400) {
            return x - 87;
        }
        if (x > 400) {
            return x / 4;
        }
        return x;
    }

    public void returnNewBoolean(boolean x) {
        if (x == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }

}
