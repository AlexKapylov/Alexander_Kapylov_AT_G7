package homework.day6.string_task;

import java.util.Arrays;

public class NumbersNotStatic {

    public void findNumbers(String wording) {
//LESS INDIAN CODE :) LESS INDIAN CODE :) LESS INDIAN CODE :)
        String[] numbersStringArray = wording.split("\\D+");
        String numbersString = String.join("", numbersStringArray);
        char[] characters = numbersString.toCharArray();
        int[] digitals = new int[characters.length];
        for (int i = 0; i < characters.length; i++) {
            digitals[i] = (characters[i] - 48);
        }
        System.out.println(Arrays.toString(digitals));
//  WARNING, INDIAN CODE!!! WARNING, INDIAN CODE!!! WARNING, INDIAN CODE!!!
//        char[] characters2 = wording.toCharArray();
//        char[] charNumbers2 = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
//        int length = 0;
//        for (int i = 0; i < characters2.length; i++) {
//            for (int j = 0; j < charNumbers2.length; j++) {
//                if (characters2[i] == charNumbers2[j]) {
//                    length++;
//                }
//            }
//        }
//        int[] numbers2 = new int[length];
//        int l = 0;
//        for (int i = 0; i < characters2.length; i++) {
//            for (int j = 0; j < charNumbers2.length; j++) {
//                if (characters2[i] == charNumbers2[j]) {
//                    numbers2[l] = (characters2[i] - 48);
//                    l++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numbers2));
    }

}
