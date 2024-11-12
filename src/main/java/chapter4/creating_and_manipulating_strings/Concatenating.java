package chapter4.creating_and_manipulating_strings;

public class Concatenating {
    public static void main(String[] args) {

        System.out.println(1 + 2);
        System.out.println("a" + "b");
        System.out.println("a" + "b" + 3);
        System.out.println(1 + 2 + "c");
        System.out.println("c" + 1 + 2);
        System.out.println("c" + null);


        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

        var s = "1";
        s += "2";
        s += "3";
        System.out.println(s);

    }
}
