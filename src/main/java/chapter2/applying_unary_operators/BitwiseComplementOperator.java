package chapter2.applying_unary_operators;

public class BitwiseComplementOperator {
    public static void main(String[] args) {

        int value = 3;
        int complement = ~value;
        System.out.println(value);
        System.out.println(complement);

        //3  -> 00000000 00000000 00000000 00000011
        //-4 -> 11111111 11111111 11111111 11111100

        //to find the bitwise complement of a number, multiply it by negative one and then subtract one
        System.out.println(-1 * value - 1);
        System.out.println(-1 * complement - 1);

    }
}
