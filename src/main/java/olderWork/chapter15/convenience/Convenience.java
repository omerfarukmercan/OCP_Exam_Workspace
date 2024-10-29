package olderWork.chapter15.convenience;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Convenience {

    public static void main(String[] args) {

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

        Predicate<String> brownEggs2 = egg.and(brown);
        Predicate<String> otherEggs2 = egg.and(brown.negate());

        Consumer<String> c1 = x -> System.out.println("1: " + x);
        Consumer<String> c2 = x -> System.out.println(",2: " + x);

        c1.accept("c1");
        c2.accept("c2");

        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Annie");

        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combinedF = after.compose(before);
        System.out.println(combinedF.apply(3));//8

    }
}
