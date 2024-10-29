package olderWork.chapter15.streams.intermediate.map;

import java.util.stream.Stream;

public class MapEx {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.map(String::length).forEach(System.out::println);

    }
}
