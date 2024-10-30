package olderWork.chapter15.streams.advanced;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class AdvancedEx {

    public static void main(String[] args) {

        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());



    }

    private static void threeDigit(Optional<Integer> optional){
        if(optional.isPresent()){
            var num = optional.get();
            var string = "" + num;
            if(string.length() == 3)
                System.out.println(string);
        }

        //Optional<Integer> result = optional.flatMap(ChainingOptionals::calculator);
    }

    private static void threeDigitStream(Optional<Integer> optional){
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }

}
