package olderWork.chapter15.streams.collecting;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAndPartitionEx {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map = ohMy.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map);

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map2 = ohMy2.collect(Collectors.groupingBy(
                String::length, TreeMap::new, Collectors.toList()
        ));
        System.out.println(map2);

        var ohMy3 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map3 = ohMy3.collect(Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map3);


        var ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map4 = ohMy4.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map4);


        var ohMy5 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map5 = ohMy5.collect(Collectors.groupingBy(
           String::length,
           Collectors.mapping(
                   s -> s.charAt(0),
                   Collectors.minBy(Comparator.comparingInt(o -> o))
           )
        ));
        System.out.println(map5);

    }

}
