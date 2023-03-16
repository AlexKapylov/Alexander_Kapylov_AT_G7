package homework.day8.input_output;

import java.io.File;

public class ShowFilesAndFolders {

    public static void main(String[] args) {
        File myFile = new File("d:/");
        for (File item : myFile.listFiles()) {
            System.out.println(item.getName());
        }
    }

}
