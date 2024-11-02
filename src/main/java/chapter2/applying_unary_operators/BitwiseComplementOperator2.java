package chapter2.applying_unary_operators;

public class BitwiseComplementOperator2 {
    public static void main(String[] args) {

        //bitwise complement operator applied to integer numeric types such as byte,short,integer,long,char

        int value = 8;
        int complement = ~value;
        System.out.println(value);
        System.out.println(complement);

        //8  -> 00000000 00000000 00000000 00001000
        //-9 -> 11111111 11111111 11111111 11110111

        int value2 = 15;
        int complement2 = ~value2;
        System.out.println(value2);
        System.out.println(complement2);

        //15  -> 00000000 00000000 00000000 00001111
        //-16 -> 11111111 11111111 11111111 11110000
    }
}
