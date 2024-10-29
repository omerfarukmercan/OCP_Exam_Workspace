package olderWork.chptr13_14.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(Map.of("key1", "value1", "key2", "value2"));
        map.forEach((s, s2) -> System.out.println(s + " " + s2));

        Map<String, String> map2 = Map.ofEntries(
                Map.entry("a1", "b1"),
                Map.entry("z1", "d1")
        );
        map2.forEach((s, s2) -> System.out.println(s + " " + s2));

        Map<String, String> map3 = Map.copyOf(map2);
        map3.forEach((s, s2) -> System.out.println(s + " " + s2));

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry:
             entries) {
            System.out.println(entry);
        }
        System.out.println(map.getOrDefault("key3", "default"));
        Set<String> keySet = map.keySet();
        keySet.forEach(System.out::println);

        map.merge("key3", "value3", String::concat);
        map.forEach((s, s2) -> System.out.println(s + " " + s2));
    }
}
