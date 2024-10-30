package olderWork.chptr13_14.map.merge;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge {
    private static Map<String, Employee> map1 = new HashMap<>();
    private static Map<String, Employee> map2 = new HashMap<>();

    public static void main(String[] args) {
        Employee employee1 = new Employee(1L, "Henry");
        map1.put(employee1.getName(), employee1);
        Employee employee2 = new Employee(22L, "Annie");
        map1.put(employee2.getName(), employee2);
        Employee employee3 = new Employee(8L, "John");
        map1.put(employee3.getName(), employee3);

        Employee employee4 = new Employee(2L, "George");
        map2.put(employee4.getName(), employee4);
        Employee employee5 = new Employee(3L, "Henry");
        map2.put(employee5.getName(), employee5);

        Map<String, Employee> map3 = new HashMap<>(map1);
        map3.merge("Henry", new Employee(10L, "10"), (v1, v2) -> new Employee(v1.getId(), v2.getName()));

        map2.forEach(
                (key, value) -> map3.merge(key, value, (v1, v2) -> new Employee(v1.getId(), v2.getName())));

        map3.forEach((s, employee) -> System.out.println(s + "- " + employee.toString()));

        Map<String, Employee> result = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (value1, value2) -> new Employee(value2.getId(), value1.getName())));
        result.forEach((s, employee) -> System.out.println(s + "- " + employee.toString()));

        Map<String, Employee> map5 = Stream.of(map1, map2)
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> new Employee(v1.getId(), v2.getName())));



        BiFunction<String, Employee, Employee> biFunction = (s, employee) -> {
            employee.setName((String) employee.getName().subSequence(0,2));
            return employee;
        };

        result.replaceAll(biFunction);
        result.put("John", new Employee(5L, "J2ohn2"));
        result.forEach((s, employee) -> System.out.println(s + "- " + employee.toString()));

        map5.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
