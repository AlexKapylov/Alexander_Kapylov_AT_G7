package homework.day6.string_task;

public class ColumnNotStatic {

    public void printColumn(String wording) {
        char[] characters = wording.toCharArray();
        for (char c : characters) {
            System.out.println(c);
        }
    }

}
