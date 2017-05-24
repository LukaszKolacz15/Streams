package pl.akademiakodu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Lukasz Kolacz on 24.05.2017.
 */
public class Exercises {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Oskar", "Piotr", "Kondzio", "Jakub", "Aleksandra", "Katarzyna", "Patryk", "Elżbieta");

        System.out.println("-------------------------------- 1 -----------------------------------");
//          DODANIE DO IMIONA MESKIEGO "M" A KOBIECEGO "K"
        names
                .stream()
                .map(s -> {
                    if (s.endsWith("a")) {
                        return s + "(K)";
                    } else {
                        return s + "(M)";
                    }
                }).forEach(System.out::println);

//                              LUB
//              ALE TO CO WYZEJ PRZYDA SIE W NASTEPNYM ZADANIU
//                .forEach(s -> {
//                    if (s.endsWith("a")) {
//                        System.out.println(s + " K");
//                    } else {
//                        System.out.println(s + " M");
//                    }
//                });

        System.out.println("-------------------------------- 2 -----------------------------------");
//          WYSWIETLANIE NAJDLUZRZEGO IMIENIA
        names
                .stream()
                .map(s -> {
                    if (s.endsWith("a")) {
                        return s + "(K)";
                    } else {
                        return s + "(M)";
                    }
                })
                .mapToInt(s -> s.length())
                .max()
                .ifPresent(System.out::println);

        System.out.println("-------------------------------- 3 -----------------------------------");
//          ZAPIS KOBIECYCH IMION DO OSOBNEJ LISTY
        List<String> womenNames = names
                .stream()
                .filter(s -> s.endsWith("a"))
                .collect(Collectors.toList());
        System.out.println(womenNames);

    }
}
