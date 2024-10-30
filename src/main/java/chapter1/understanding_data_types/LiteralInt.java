package chapter1.understanding_data_types;

public class LiteralInt {
    public static void main(String[] args) {

        //long max = 3123456789;//DOES NOT COMPILE , int literalinin max degerini gecer
        long max = 3123456789L;

        //long literal = -214783649l;//DOES NOT COMPILE , int literalinin min degerini gecer
        long literal = -214783649l;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
