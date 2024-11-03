package chapter2.comparing_values;

public class InstanceOfOperator4 {
    public static void main(String[] args) {

        System.out.println(null instanceof Object);
        Object noObjectHere = null;
        System.out.println(noObjectHere instanceof String);
//        System.out.println(null instanceof null);//DOES NOT COMPILE
    }
}
