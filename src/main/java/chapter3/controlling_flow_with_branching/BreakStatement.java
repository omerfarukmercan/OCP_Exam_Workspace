package chapter3.controlling_flow_with_branching;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if(i == 10){
                break;
            }
        }

    }
}
