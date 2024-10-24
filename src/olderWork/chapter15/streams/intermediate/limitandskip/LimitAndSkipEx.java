package olderWork.chapter15.streams.intermediate.limitandskip;

import java.util.stream.Stream;

public class LimitAndSkipEx {

    public static void main(String[] args) {

        Stream<Integer> s = Stream.iterate(1, n -> n + 1);

        s.skip(5).limit(2).forEach(System.out::println);

    }
}
