package chapter1.initializing_variables;

import lombok.ToString;

import java.util.List;

public class DefiningInstanceAndClassVariables {

    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println(sample);
        System.out.println(Sample.lock);
    }

}

@ToString
class Sample{
    int number;
    boolean activated;
    long size;
    double square;
    String name;
    List<Integer> configs;
    static Object lock;
    char c;
}
