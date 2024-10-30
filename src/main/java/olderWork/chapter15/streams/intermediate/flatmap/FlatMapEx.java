package olderWork.chapter15.streams.intermediate.flatmap;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapEx {

    public static void main(String[] args) {

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(Collection::stream).forEach(System.out::println);

    }
}
