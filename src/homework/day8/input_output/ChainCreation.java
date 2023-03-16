package homework.day8.input_output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ChainCreation {

    public static void main(String[] args) throws IOException {
        File myDirectory = new File("d:/hello/my/big/world/");
        File myFile1 = new File("d:/hello/my/big/world/file1.txt");
        File myFile2 = new File("d:/hello/my/big/world/file2.txt");
        Random random = new Random();

        myDirectory.mkdirs();
        myFile1.createNewFile();
        myFile2.createNewFile();
        BufferedWriter out1 = new BufferedWriter(new FileWriter(myFile1));
        BufferedWriter out2 = new BufferedWriter(new FileWriter(myFile2));
        for (int i = 0; i < 10; i++) {
            out1.write(" " + random.nextInt(20));
            out2.write(" " + random.nextInt(20));
        }
        out1.close();
        out2.close();
    }

}
