package chapter4.creating_and_manipulating_strings;

public class FormattingValues2 {

    public static void main(String[] args) {
        var name = "James";
        var score = 90.25;
        var total = 100;
        System.out.println("%s:%n Score: %f out of %d"
                .formatted(name, score, total));
    }

}
