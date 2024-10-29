package chapter1.understanding_data_types;

public class UsingPrimitiveTypes {
    public static void main(String[] args) {
        /*
         * tam sayili degiskenler icin default int atanir. eger long kullanilacaksa l veya L ile belirtilmelidir
         * decimal point degerler icin default double kullanilmaktadir. float icinse f veya F ile belirtilmelidir.
         * shot ve char 16 bittir. short signed ama char unsigned dir
         */

        boolean actived = true;

        byte size = 100;
        //byte height = 128;//does not compile

        System.out.println("byte max value: " + Byte.MAX_VALUE);
        System.out.println("byte min value: " + Byte.MIN_VALUE);

        short count = 15000;

        System.out.println("short max value " + Short.MAX_VALUE);
        System.out.println("short min value " + Short.MIN_VALUE);

        float sum = 150;
        long sum2 = 150;

        float square = 125.56f;
        float square2 = 1251.563F;
    }
}
