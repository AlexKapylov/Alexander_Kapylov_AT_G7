package homework.day12;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumbersModRunner {

    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
        numbersMod.map(String::valueOf).filter(n -> n.contains("3")).flatMap(n -> Arrays.stream(n.split("")))
                .map(n -> {
                    switch (n) {
                        case "0" -> n = "ноль";
                        case "1" -> n = "один";
                        case "2" -> n = "два";
                        case "3" -> n = "три";
                        case "4" -> n = "четыре";
                        case "5" -> n = "пять";
                        case "6" -> n = "шесть";
                        case "7" -> n = "семь";
                        case "8" -> n = "восемь";
                        case "9" -> n = "девять";
                    }
                    return n;
                }).distinct().sorted((n1, n2) -> {
                    switch (n1) {
                        case "ноль" -> n1 = "0";
                        case "один" -> n1 = "1";
                        case "два" -> n1 = "2";
                        case "три" -> n1 = "3";
                        case "четыре" -> n1 = "4";
                        case "пять" -> n1 = "5";
                        case "шесть" -> n1 = "6";
                        case "семь" -> n1 = "7";
                        case "восемь" -> n1 = "8";
                        case "девять" -> n1 = "9";
                    }
                    switch (n2) {
                        case "ноль" -> n2 = "0";
                        case "один" -> n2 = "1";
                        case "два" -> n2 = "2";
                        case "три" -> n2 = "3";
                        case "четыре" -> n2 = "4";
                        case "пять" -> n2 = "5";
                        case "шесть" -> n2 = "6";
                        case "семь" -> n2 = "7";
                        case "восемь" -> n2 = "8";
                        case "девять" -> n2 = "9";
                    }
                    return -Integer.valueOf(n1).compareTo(Integer.valueOf(n2));
                }).forEach(System.out::println);
    }

}
