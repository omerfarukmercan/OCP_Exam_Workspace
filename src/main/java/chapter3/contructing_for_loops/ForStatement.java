package chapter3.contructing_for_loops;

public class ForStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 5; System.out.println("iteration : " + i)) {
            System.out.println("in the loop : " + i);
            i++;
        }

        int i = 0;
        for (; i < 10;) {
            System.out.println(i);
            i++;
        }

    }
}
