package cycletask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class TrainArray {
    int[] arr = new int[7];

    public void startRandom() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public void showItems() {
        System.out.println(Arrays.toString(arr));
    }

    public void reverseItems() {
        int i = arr.length - 1;
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println("");
    }

    public void multItems() {
        int i = 0;
        int x5;
        while (i < arr.length) {
            x5 = arr[i] * 5;
            System.out.print(x5 + " ");
            i++;
        }
        System.out.println("");
    }

    public void squareItems() {
        int i = 0;
        int xsqr;
        while (i < arr.length) {
            xsqr = arr[i] * arr[i];
            System.out.print(xsqr + " ");
            i++;
        }
        System.out.println("");
    }

    public void minItem() {
        int i;
        int min = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public void replace() {
        int first;
        int last;
        first = arr[0];
        last = arr[arr.length - 1];
        arr[0] = last;
        arr[arr.length - 1] = first;
        System.out.println(Arrays.toString(arr));
        arr[0] = first;
        arr[arr.length - 1] = last;
    }

    public void sortItems() {
        System.out.println(Arrays.toString(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray()));
    }

}
