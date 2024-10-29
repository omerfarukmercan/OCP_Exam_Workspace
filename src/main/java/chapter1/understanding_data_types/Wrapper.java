package chapter1.understanding_data_types;

public class Wrapper {
    public static void main(String[] args) {

        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        //Integer nfe = Integer.valueOf("123.5"); //numberformatexpcetion

        System.out.println(primitive);
        System.out.println(wrapper);

        Double apple = Double.valueOf("200.99");
        System.out.println(apple.byteValue());
        System.out.println(apple.intValue());
        System.out.println(apple.doubleValue());

        //Double nfe2 =  Double.valueOf("290,11"); //numberformatexception

        int max = Integer.max(10, 25);
        int min = Integer.min(50, 123);
        int sum = Integer.sum(11,21);

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);

        long max2 = Long.max(10, 25);
        long min2 = Long.min(50, 123);
        long sum2 = Long.sum(11,21);

        System.out.println(max2);
        System.out.println(min2);
        System.out.println(sum2);



    }
}
