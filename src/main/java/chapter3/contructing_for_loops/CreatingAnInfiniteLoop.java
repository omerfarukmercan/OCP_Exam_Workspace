package chapter3.contructing_for_loops;

public class CreatingAnInfiniteLoop {

    public static void main(String[] args) {

        for(;;){
            System.out.println("HelloWorld");//infinite
        }

        //System.out.println("here"); // does not compile -> unreachable code
    }
}
