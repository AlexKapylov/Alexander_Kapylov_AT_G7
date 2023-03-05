package homework.day6.string_task;

public class DuplicateNotStatic {

    public void printDuplicates(String wording) {
        String[] wordsArray = wording.split(" ");
        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = i + 1; j < wordsArray.length; j++) {
                if (wordsArray[i].equals(wordsArray[j])) {
                    System.out.println(wordsArray[i]);
                }
            }
        }
    }

}
