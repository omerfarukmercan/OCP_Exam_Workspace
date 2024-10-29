package olderWork.chapter15;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Example {

    public static void main(String[] args) {

        Function<List<String>, String> ex1 = x -> x.get(0);

        UnaryOperator<Long> ex2 = (Long l) -> 3L;

        Predicate<String> ex4 = String::isEmpty;

    }
}
