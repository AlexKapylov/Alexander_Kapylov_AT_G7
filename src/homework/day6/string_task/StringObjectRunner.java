package homework.day6.string_task;

public class StringObjectRunner {

    public static void main(String[] args) {
        new ColumnNotStatic().printColumn("Мама мыла раму");
        System.out.println("----------------------------------------");
        new DuplicateNotStatic().printDuplicates("папа мыл раму первого окна и папа мыл раму второго окна");
        System.out.println("----------------------------------------");
        new NumbersNotStatic().findNumbers("1 2 1 пришли в 51 600 гости");
        System.out.println("----------------------------------------");
        new CurrentDateNotStatic().printDate();
        System.out.println("----------------------------------------");
        new DateFormatNotStatic().changeFormat("22.00 07.09.2020");
        System.out.println("----------------------------------------");
        new VowelDateNotStatic().printVowelDate("МамА сказала HellO");
        System.out.println("----------------------------------------");
        new LogNotStatic().printLogsReport("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 granted\n" +
                "access_log.2020.09.07 212.168.122.6 denied");
    }

}
