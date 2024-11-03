package chapter2.assigning_values;

public class CastingValuesVsVariables {
    public static void main(String[] args) {

        //  The compiler doesn’t require casting when working with literal values that fit into the data type.
        byte hat = 1;
        byte gloves = 7 * 10;
        short scarf = 5;
        short boots = 2 + 1;

//        short boots2 = 2 + hat; //DOES NOT COMPILE
//        hat degisken oldugu icin burada int'e promote edilir. Literal olsaydi overflow yoksa kabul olurdu.
//
//        byte gloves2 = 7 * 100; //DOES NOT COMPILE
//        overflow oldugundan

    }

}
