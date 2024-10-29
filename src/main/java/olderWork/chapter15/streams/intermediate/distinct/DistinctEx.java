package olderWork.chapter15.streams.intermediate.distinct;

import java.util.stream.Stream;

public class DistinctEx {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::println);

    }
}
