package homework.day8.input_output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShowWordsAndPunctuationMark {

    public static void main(String[] args) throws IOException {
        int punctuationMarks = 0;
        int words = 0;
        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;

        while ((line = in.readLine()) != null) {
            String[] wordsArray1 = line.split("[\\p{Punct}\\d\\s]+");
            System.out.println(line);
            words = (words + wordsArray1.length);
            int countPunctuationLine = line.length() - line.replaceAll("\\p{Punct}", "").length();
            punctuationMarks = (punctuationMarks + countPunctuationLine);
        }
        in.close();
        System.out.printf("Знаки препинания - %s, слова - %s.", punctuationMarks, words).println();
    }

}
