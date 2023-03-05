package homework.day6.string_task;

import java.util.HashMap;
import java.util.Map;

public class LogNotStatic {

    public void printLogsReport(String logs) {
        String[] logsArray = logs.split("\n");
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < logsArray.length; i++) {
            logsArray[i] = logsArray[i].substring(22);
        }
        for (int i = 0; i < logsArray.length; i++) {
            Integer count = hashMap.get(logsArray[i]);
            hashMap.put(logsArray[i], count == null ? 1 : count + 1);
        }
        String[][] mainArray = new String[hashMap.size()][3];
        int n = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            mainArray[n][0] = entry.getKey().toString().substring(0, 13);
            mainArray[n][1] = entry.getKey().toString().substring(14);
            mainArray[n][2] = entry.getValue().toString();
            n++;
        }
        for (int i = 0; i < mainArray.length; i++) {
            String iP = (mainArray[i][0]);
            String oK = "0";
            String failed = "0";
            if (i != 0 && iP.equals(mainArray[i - 1][0])) {
                continue;
            }
            for (int j = 0; j < mainArray.length; j++) {
                if (iP.equals(mainArray[j][0]) && mainArray[j][1].equals("granted")) {
                    oK = mainArray[j][2];
                } else if (iP.equals(mainArray[j][0]) && mainArray[j][1].equals("denied")) {
                    failed = mainArray[j][2];
                }
            }
            System.out.printf("ip %s: ok - %s, failed - %s", iP, oK, failed).println();
        }
    }

}
