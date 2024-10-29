package olderWork.chapter15.streams.intermediate.sorted;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedEx {

    public static <Collections> void main(String[] args) {

        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::println);

        Stream<String> s2 = Stream.of("brown-", "bear-");
        s2.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

}
