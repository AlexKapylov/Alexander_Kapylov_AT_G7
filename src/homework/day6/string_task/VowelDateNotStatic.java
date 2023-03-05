package homework.day6.string_task;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class VowelDateNotStatic {

    public void printVowelDate(String wording) {
        char[] wordingCharacters = wording.toLowerCase().toCharArray();
        char[] vowelCharacters = new char[]{'ё', 'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю', 'e', 'y', 'u', 'i', 'o', 'a'};
        int vowelCounter = 0;
        for (int i = 0; i < wordingCharacters.length; i++) {
            for (int j = 0; j < vowelCharacters.length; j++) {
                if (wordingCharacters[i] == vowelCharacters[j]) {
                    vowelCounter++;
                }
            }
        }
        LocalDate currentDate = LocalDate.now();
        int dayOfMonth = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        Calendar calendar = new GregorianCalendar(year, (month - 1), dayOfMonth);
        calendar.add(Calendar.DAY_OF_MONTH, vowelCounter);
        System.out.printf("Сгенерированная гласная дата: %1$te %1$tB", calendar.getTime()).println();
    }

}
