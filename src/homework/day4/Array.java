package homework.day4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Array {

    int myMaxValue;

    public Array(int myMaxValue) {
        this.myMaxValue = myMaxValue;
    }

    public static void main(String[] args) {
        int[] myArray = new int[20];
        Random random = new Random();
        int maxValue = 10;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(maxValue);
        }
        System.out.println("Созданный массив: "+Arrays.toString(myArray));
        Array workObject = new Array(maxValue);
        workObject.sumItemsDivByN(myArray, 5);
        workObject.newArrayWithItemsMoreThenN(myArray, 4);
        workObject.sumItemsDivByMonth(myArray);
        workObject.drawPicture();
    }

    private void sumItemsDivByN(int[] myArray, int n) {
        int i;
        int sumItems = 0;
        for (i = 1; i <= myArray.length; i++) {
            if (n == 1) {
                for (i = 0; i < myArray.length; i++) {
                    sumItems += myArray[i];
                }
                System.out.println("Сумма каждого " + n + "-го элемента массива равна " + sumItems);
                break;
            } else if (i % n == 0) {
                sumItems += myArray[i - 1];
            }
        }
        System.out.println("Сумма каждого " + n + "-го элемента массива равна " + sumItems);
    }

    private int[] newArrayWithItemsMoreThenN(int[] myArray, int n) {
        int newArrayLength = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > n) {
                newArrayLength++;
            }
        }
        int[] newArray = new int[newArrayLength];
        int j = newArrayLength - 1;
        if (n >= myMaxValue) {
            System.out.println("В массиве нет элементов, больше числа " + n);
            return null;
        } else {
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] > n) {
                    newArray[j--] = myArray[i];
                }
            }
            System.out.println("Массив с элементами, которые больше, чем " + n + ", расположенными в обратном порядке: " + Arrays.toString(newArray));
            return newArray;
        }
    }
    private int sumItemsDivByMonth (int [] myArray){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int sum = 0;
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]%month==0){
                sum +=myArray[i];
            }
        }
        System.out.println("Сумма элементов массива, кратных текущему месяцу ("+month+") равна "+sum);
        return sum;
    }
    private void drawPicture (){
        System.out.println("\t  ^__^");
        System.out.println("\t  (oo)\\\\_______");
        System.out.println("\t (__)\\ ) \\/\\  \\");
        System.out.println("\t      ||----w |\\");
        System.out.println("\t      ||     ||");
    }
}
