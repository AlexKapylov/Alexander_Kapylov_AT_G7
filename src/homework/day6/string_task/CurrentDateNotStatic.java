package homework.day6.string_task;

import java.util.Date;

public class CurrentDateNotStatic {

    public void printDate() {
        Date dateFast = new Date();
        System.out.printf("Сейчас на дворе: %1$te %1$tB, %1$tY, %1$tk часа(-ов) %1$tM минут(-а/-ы)", dateFast).println();
    }

}
