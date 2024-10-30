package olderWork.chapter15.streams.intermediate.peek;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PeekEx {

    public static void main(String[] args) {

        var stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g")).peek(System.out::println).count();
        System.out.println(count);

        var numbers = new ArrayList<>();
        var letters = new ArrayList<>();
        numbers.add(1);
        letters.add("a");
        Stream<List<?>> stream2 = Stream.of(numbers, letters);
        stream2.map(List::size).forEach(System.out::print);

        Stream<List<?>> stream3 = Stream.of(numbers, letters);
        stream3.peek(x -> x.remove(0)).map(List::size).forEach(System.out::print);
    }
}
