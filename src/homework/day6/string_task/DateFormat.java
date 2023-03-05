package homework.day6.string_task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {

    public static void changeFormat(String dateInfo) {
        SimpleDateFormat myFormat = new SimpleDateFormat("HH.mm dd.MM.yyyy");
        try {
            Date date = myFormat.parse(dateInfo);
            SimpleDateFormat needFormat = new SimpleDateFormat("MMMM, d, yyyy HH:mm", Locale.ENGLISH);
            System.out.println(needFormat.format(date));
        } catch (ParseException e) {

        }
    }

}
