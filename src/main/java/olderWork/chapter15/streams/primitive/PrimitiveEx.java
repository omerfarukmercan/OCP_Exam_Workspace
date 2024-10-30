package olderWork.chapter15.streams.primitive;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveEx {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3);
        System.out.println(stream.reduce(0 , Integer::sum));

        Stream<Integer> stream2 = Stream.of(1,2,3);
        System.out.println(stream2.mapToInt(x -> x).sum());

        DoubleStream empty = DoubleStream.empty();

        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);

        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        varargs.forEach(System.out::println);

        var random = DoubleStream.generate(Math::random);
        var fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(3).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);

        IntStream count = IntStream.iterate(1 , n -> n +1 ).limit(5);
        count.forEach(System.out::println);

        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::println);

    }

}
