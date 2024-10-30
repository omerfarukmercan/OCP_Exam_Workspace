package olderWork.chapter15.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {

    public static void main(String[] args) {

        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for(String name: list)
            if(name.length() == 4)
                filtered.add(name);

        Collections.sort(filtered);
        var iter = filtered.iterator();

        if(iter.hasNext()) System.out.println(iter.next());
        if(iter.hasNext()) System.out.println(iter.next());
        if(iter.hasNext()) System.out.println(iter.next());

        System.out.println("--------------");
        var list2 = List.of("Toby", "Anna", "Leroy", "Alex");
        list2.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);

        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);

//        Stream.generate(() -> "Elsa 1234")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);

        long count = Stream.of("goldfish", "finch")
                .filter(s -> s.length() > 5)
                .toList()
                .stream()
                .count();
        System.out.println(count);

    }
}
