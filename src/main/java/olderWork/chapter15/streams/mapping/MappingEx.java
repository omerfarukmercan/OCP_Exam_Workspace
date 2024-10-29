package olderWork.chapter15.streams.mapping;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MappingEx {

    public static void main(String[] args) {

        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(String::length);

        var integerList = new ArrayList<Integer>();
        IntStream ints = integerList.stream().flatMapToInt(IntStream::of);

        DoubleStream doubles = integerList.stream().flatMapToDouble(DoubleStream::of);

        LongStream longs = integerList.stream().flatMapToLong(LongStream::of);

        var stream2 = IntStream.rangeClosed(1, 10);
        OptionalDouble optional = stream2.average();
        System.out.println(optional.getAsDouble());

        LongStream longs2 = LongStream.of(5, 10);
        long sum = longs2.sum();
        System.out.println(sum);
        DoubleStream doubles2 = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.min();
        System.out.println(min.isPresent());

        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;
        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());

        var d = 1.0;
        DoubleToIntFunction f1 = x -> 1;
        f1.applyAsInt(d);

    }

    private static int range(IntStream ints){
        IntSummaryStatistics stats = ints.summaryStatistics();
        if(stats.getCount() == 0)
            throw new RuntimeException();
        return stats.getMax() - stats.getMin();
    }

    private static int max(IntStream ints){
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }

    private static Stream<Integer> mapping(IntStream stream){
        return stream.mapToObj(x -> x);
    }

    private static Stream<Integer>  boxing(IntStream stream){
        return stream.boxed();
    }

}
