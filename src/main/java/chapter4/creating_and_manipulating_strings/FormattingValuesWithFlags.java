package chapter4.creating_and_manipulating_strings;

public class FormattingValuesWithFlags {

    public static void main(String[] args) {
        // By default %f displays exactly six digits past the decimal.
        var pi = 3.14159265359;

        System.out.format("[%f]\n", pi);      // [3.141593]
        System.out.format("[%12.8f]\n", pi);  // [  3.14159265]
        System.out.format("[%012f]\n", pi);   // [00003.141593]
        System.out.format("[%12.2f]\n", pi);  // [        3.14]
        System.out.format("[%.3f]\n", pi);    // [3.142]
    }

    
}
