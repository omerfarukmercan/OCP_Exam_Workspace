package chapter2.assigning_values;

public class CompoundAssignmentOperator2 {
    public static void main(String[] args) {

        long goat = 10;
        int sheep = 5;
//        sheep = sheep * goat; //DOES NOT COMPILE
        sheep *= goat;
        // The compound operator will first cast sheep to a long, apply the multiplication of two long values, and then cast the result to an int.
        System.out.println(sheep);


        byte b1 = 100;
        byte b2 = 30;
        b1 += b2;//overflow
        System.out.println(b1);

    }
}
