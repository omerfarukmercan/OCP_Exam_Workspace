package olderWork.chapter15.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = s -> s.length();

        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (s1, s2) -> s1.concat(s2);

        System.out.println(b1.apply("baby", "chick"));
        System.out.println(b2.apply("baby", "chick"));

    }
}
