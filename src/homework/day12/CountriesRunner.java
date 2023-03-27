package homework.day12;

import java.util.stream.Stream;

public class CountriesRunner {

    public static void main(String[] args) {
        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");
        countries.filter(c -> c.contains("ё") || c.contains("у") || c.contains("е") || c.contains("э") ||
                        c.contains("о") || c.contains("а") || c.contains("ы") || c.contains("я") || c.contains("и") ||
                        c.contains("ю") || c.contains("e") || c.contains("y") || c.contains("u") || c.contains("i") ||
                        c.contains("o") || c.contains("a") || c.contains("Ё") || c.contains("У") || c.contains("Е") || c.contains("Э") ||
                        c.contains("О") || c.contains("А") || c.contains("Ы") || c.contains("Я") || c.contains("И") ||
                        c.contains("Ю") || c.contains("E") || c.contains("Y") || c.contains("U") || c.contains("I") ||
                        c.contains("O") || c.contains("A")).filter(c -> c.length() < 7).map(String::toUpperCase)
                .map(c -> '"' + c + '"').forEach(System.out::println);
    }

}
