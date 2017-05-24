package pl.akademiakodu;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("Oskar", "Piotr", "Kondzio", "Kuba");

//        FILTROWANIE INFORMACJI:
        myList.stream()
                .filter(s -> s.startsWith("O"))
                .forEach(s -> System.out.println(s));


        System.out.println("------------------------------------ SORTOWANIE ---------------------------------------------");
//        SORTOWANIE INFORMACJI:
        myList.stream()
                .filter(s -> s.length() > 4)                    //warunek ze imie musi byc wieksze niz 4 znaki
                .sorted((s, s1) -> s.compareToIgnoreCase(s1))   //sortowanie
                .map(s -> s.toUpperCase())                      //podbijanie do wielkich znakow
//                .forEach(s -> System.out.println(s));
//                             LUB
                .findFirst()
                .ifPresent(s -> System.out.println(s));


        System.out.println("----------------------------------- NULL ------------------------------------------------");
//        OPTIONAL SPRAWDZAJACY/ZABEZPIECZAJACY PRZED NULL-ami
//        TODO: Sprawdzić poprawność z nagraniem (23.05.2017) bo sypie wyjątkiem
//        Optional<String> optional = Optional.of(null);

//        if(optional.isPresent()){
//            System.out.println(optional.get());
//        }else{
//            System.out.println("Ten obiekt jest nullem");
//        }
//                             LUB
//        optional.ifPresent(s -> System.out.println(s));

//              -------------------------------------------------------------------------
//        String obiekt = null;
        String obiekt = "Akademia kodu jest fajna!";

        Optional<String> myOptional = Optional.ofNullable(obiekt);

        if (myOptional.isPresent()) {
            System.out.println("Obiekt istnieje " + myOptional.get());
        } else {
            System.out.println("Obiekt jest nullem");
        }

                



        System.out.println("-----------------------------------------------------------------------------------");
//        INNY SPOSOB TWORZENIA STREAMA
        Stream.of("a142", "a2124", "a323")
                .map(s -> s.substring(1))
                .mapToInt(s -> Integer.valueOf(s))
//                .average()
                .map(s -> s + 100)
                .min()
                .ifPresent(s -> System.out.println(s));

        System.out.println("-----------------------------------------------------------------------------------");
        IntStream.of(5, 10, 124, 123)
                .average()
//                .ifPresent(System.out::println); //COLON - stricte do lambd
//                          LUB
                .ifPresent(s -> System.out.println(s));


        System.out.println("------------------------------------- STATYSTYKI --------------------------------------------");
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Oskar", 26));
        personList.add(new Person("Piotr", 20));
        personList.add(new Person("Lukasz", 20));
        personList.add(new Person("Kuba", 14));

        String message = personList.stream()
                .filter(person -> person.getAge() >= 18)
                .map(person -> person.getName())
                .collect(Collectors.joining(" i ", "Powyzej 18 lat sa: ", ". "));

        System.out.println(message);

        Double aver = personList.stream()
                .collect(Collectors.averagingInt(person -> person.getAge()));
        System.out.println("Srednia wieku to: " + aver);

        IntSummaryStatistics statistics = personList.stream()
                .collect(Collectors.summarizingInt(person -> person.getAge()));
        System.out.println("Statystyki: " + statistics);


        System.out.println("-----------------------------------------------------------------------------------");
        List<String> converted = personList.stream()
                .map(s -> s.getName())
                .collect(Collectors.toList());
        System.out.println(converted);


        System.out.println("-------------------------------------- GRUPOWANIE -------------------------------------------");
//        GRUPOWANIE:
        Map<Integer, List<Person>> groupByAge = personList.stream()
                .collect(Collectors.groupingBy(s -> s.getAge()));

        groupByAge.forEach((a, b) -> System.out.println(a + " : " + b.toString()));

    }
}
