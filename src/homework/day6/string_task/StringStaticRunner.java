package homework.day6.string_task;

import static homework.day6.string_task.Column.printColumn;
import static homework.day6.string_task.CurrentDate.printDate;
import static homework.day6.string_task.DateFormat.changeFormat;
import static homework.day6.string_task.Duplicate.printDuplicates;
import static homework.day6.string_task.Numbers.findNumbers;
import static homework.day6.string_task.VowelDate.printVowelDate;
import static homework.day6.string_task.Log.printLogsReport;

public class StringStaticRunner {

    public static void main(String[] args) {
        printColumn("Мама мыла раму");
        System.out.println("----------------------------------------");
        printDuplicates("папа мыл раму первого окна и папа мыл раму второго окна");
        System.out.println("----------------------------------------");
        findNumbers("1 2 1 пришли в 51 600 гости");
        System.out.println("----------------------------------------");
        printDate();
        System.out.println("----------------------------------------");
        changeFormat("22.00 07.09.2020");
        System.out.println("----------------------------------------");
        printVowelDate("МамА сказала HellO");
        System.out.println("----------------------------------------");
        printLogsReport("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied");
    }

}
