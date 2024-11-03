package chapter2.comparing_values;

public class CheckingForUnperformedSideEffects {
    public static void main(String[] args) {

        int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
        System.out.println(rabbit);


        int number = 10;
        boolean result = (number >= 20) || (number++ <=15);
        System.out.println(result);
        System.out.println(number);

    }
}
