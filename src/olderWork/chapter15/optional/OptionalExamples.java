package olderWork.chapter15.optional;

import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {
        System.out.println(average());
        Optional<Double> average = average(82,94,100);
        average.ifPresent(System.out::println);

        Optional<Double> opt = average();
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(Math::random));
        System.out.println(opt.orElseThrow());
    }

    public static Optional<Double> average(int... scores){
        if(scores.length == 0)
            return Optional.empty();
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.ofNullable((double) sum / scores.length);
    }


}
