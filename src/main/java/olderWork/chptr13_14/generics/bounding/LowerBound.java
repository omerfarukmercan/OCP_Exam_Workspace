package olderWork.chptr13_14.generics.bounding;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {

    public static void addSound(List<? super String> list){
        list.add("tweet2");
        
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");
        strings.add("2");

        List<Object> objects = new ArrayList<>();
        objects.add(new Goose());
        objects.add(new HangGlider());
        addSound(strings);
        addSound(objects);
        strings.forEach(System.out::println);
        objects.forEach(System.out::println);
    }

}
