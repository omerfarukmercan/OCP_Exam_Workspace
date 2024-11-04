package chapter3.contructing_for_loops;

public class ReDeaclaringAVariable {
    public static void main(String[] args) {


//        int x = 0;
//        for(int x = 4; x < 5; x++){ //DOES NOT COMPILE
//            System.out.println(x + "");
//        }


        int x = 0;
        for(x = 4; x < 5; x++){
            System.out.println(x + "");
        }

    }
}
