package chapter2.comparing_values;

public class InstanceOfOperator3 {
    public static void main(String[] args) {

        openZoo(10);
        openZoo(10.0);
        openZoo(0.5);
        openZoo(20L);
        openZoo(20F);
        openZoo((short) 10);

    }

    public static void openZoo(Number time){
        if(time instanceof Integer){
            System.out.println((Integer) time + " O'clock " + " classname : " + time.getClass());
        }else{
            System.out.println(time + " className : " + time.getClass());
        }
    }

    public static void openZoo2(Number time){
//        if(time instanceof String){ //DOES NOT COMPILE
//            System.out.println(time);
//        }
    }

}
