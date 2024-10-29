package olderWork.chapter15.streams.collecting;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingEx {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result);

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
        System.out.println(result2);

        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result3 = ohMy3.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result3);

        var ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy4.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(map);

        //var ohMy5 = Stream.of("lions", "tigers", "bears");
        //Map<Integer, String> map2 = ohMy5.collect(Collectors.toMap(String::length, s->s));
        //System.out.println(map2);

        var ohMy6 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map6 = ohMy6.collect(Collectors.toMap(String::length, k->k, (s1, s2) -> s1 + "," + s2, TreeMap::new));
        System.out.println(map6);

    }

}
