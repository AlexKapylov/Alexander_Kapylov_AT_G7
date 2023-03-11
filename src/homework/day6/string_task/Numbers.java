package homework.day6.string_task;

import java.util.Arrays;

public class Numbers {

    public static void findNumbers(String wording) {
        String[] numbersStringArray = wording.split("\\D+");
        String numbersString = String.join("", numbersStringArray);
        char[] characters = numbersString.toCharArray();
        int[] digitals = new int[characters.length];
        for (int i = 0; i < characters.length; i++) {
            digitals[i] = (characters[i] - 48);
        }
        System.out.println(Arrays.toString(digitals));
    }

}
