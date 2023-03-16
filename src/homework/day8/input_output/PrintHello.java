package homework.day8.input_output;

import java.util.Scanner;

public class PrintHello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.printf("Hello, I just got '%s' from you!", incoming).println();
        }
    }

}
