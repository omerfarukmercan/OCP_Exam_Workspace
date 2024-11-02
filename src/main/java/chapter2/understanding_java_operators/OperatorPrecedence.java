package chapter2.understanding_java_operators;

public class OperatorPrecedence {
    public static void main(String[] args) {

        int height = 5;
        int length = 10;

        var perimeter = 2 * height + 2 * length;
        var perimeter2 = ((2 * height) + (2 * length));//same

        System.out.println(perimeter2);
        System.out.println(perimeter);

    }
}
