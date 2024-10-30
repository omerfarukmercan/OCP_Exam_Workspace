package olderWork.chapter15.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {

        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1,2,3);

        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();

        var list2 = List.of("a", "b", "c");
        Stream<String> fromListParallel = list2.parallelStream();

        //Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n < 100, n -> n + 2);
        oddNumbers.max(Comparator.comparingInt(i -> i)).ifPresent(System.out::println);

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        var list3 = List.of("monkey", "2", "chimp");
        Stream<String> infinite3 = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list3.stream().anyMatch(pred));
        System.out.println(list3.stream().allMatch(pred));
        System.out.println(list3.stream().noneMatch(pred));
        System.out.println(infinite3.anyMatch(pred));

        Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
        s4.forEach(System.out::println);

    }
}
