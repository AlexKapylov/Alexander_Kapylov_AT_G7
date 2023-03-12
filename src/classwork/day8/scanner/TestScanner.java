package classwork.day8.scanner;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String incoming = scanner.nextLine();
            if(incoming.equalsIgnoreCase("stop")){
                break;
            }
                System.out.printf("Just got '%s' text!", incoming).println();
        }
    }

}
