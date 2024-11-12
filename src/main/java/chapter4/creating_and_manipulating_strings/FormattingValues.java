package chapter4.creating_and_manipulating_strings;

public class FormattingValues {

    public static void main(String[] args) {

        var name = "Kate";
        var orderId = 10;

        System.out.println("Hello " + name + ", order " + orderId + " is ready");
        System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
        System.out.printf("Hello %s, order %d is ready%n", name, orderId); // same as String.format
        System.out.println("Hello %s, order %d is ready".formatted(name, orderId));

    }

}
