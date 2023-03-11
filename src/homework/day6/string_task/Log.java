package homework.day6.string_task;

public class Log {

    public static void printLogsReport(String logs) {
        String[] logsArray = logs.split("\n");
        for (int i = 0; i < logsArray.length; i++) {
            logsArray[i] = logsArray[i].substring(22);
        }

        String[][] mainArray = new String[logsArray.length][3];
        for (String[] item : mainArray) {
            for (int i = 0; i < 3; i++) {
                item[i] = "0";
            }
        }

        for (String log : logsArray) {
            String[] ipArray = log.split(" ");
            for (String[] item : mainArray) {
                if (ipArray[0].equals(item[0]) || item[0].equals("0")) {
                    if (item[0].equals("0")) {
                        item[0] = ipArray[0];
                    }
                    if (ipArray[1].equals("granted")) {
                        item[1] = String.valueOf(Integer.valueOf(item[1]) + 1);
                    } else {
                        item[2] = String.valueOf(Integer.valueOf(item[2]) + 1);
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[i][0].equals("0")) {
                continue;
            }
            System.out.printf("ip %s: ok - %s, failed - %s", mainArray[i][0], mainArray[i][1], mainArray[i][2]).println();
        }
    }

}
