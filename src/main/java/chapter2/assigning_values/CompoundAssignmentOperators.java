package chapter2.assigning_values;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {

        int a = 10;
        a += 5;
        System.out.println("a : " + a);

        int a2 = 20;
        a2 = a2 + 5;
        System.out.println("a2 : " + a2);

        int a3 = 10;
        a3 = a3 =+ 5;
        System.out.println("a3 : " + a3);

        double b = 2.5;
        b -= 0.2;
        System.out.println("b " + b);

        int c = 20;
        c *= 100;
        System.out.println("c " + c);

        int a4 = 10;
        a4 = a4 = a4 =+ 5;
        System.out.println("a4 : " + a4);

    }
}
