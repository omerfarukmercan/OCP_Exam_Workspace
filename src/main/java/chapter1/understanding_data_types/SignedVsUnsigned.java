package chapter1.understanding_data_types;

public class SignedVsUnsigned {
    public static void main(String[] args) {

        // char unsigned oldugu icin 0 ve + degerler alabilir

        short s1 = 100;
        short s2 = +300;
        short s3 = -500;
        short s4 = 0;

        char c1 = 100;
        char c2 = 400;
        char c3 = 0;
        //char c4 = -1;//does not compile

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println((int)Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE);

    }
}
