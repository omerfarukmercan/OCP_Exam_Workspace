package olderWork.chapter15.streams;

import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {


        var array = new String[]{"w", "o", "l", "f"};
        var result = "";
        for(var s: array){
            result = result + s ;
        }
        System.out.println(result);

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", String::concat);
        System.out.println(word);

        Stream<Integer> stream2 = Stream.of(3, 5, 6);
        Integer multiplicationResult = stream2.reduce(1, (i1, i2) -> i1 * i2);
        System.out.println(multiplicationResult);

        Stream<String> stream3 = Stream.of("w", "o", "l", "f!");
        int length = stream3.reduce(0, (i, s) -> i + s.length(), Integer::sum);
        System.out.println(length);

    }
}
