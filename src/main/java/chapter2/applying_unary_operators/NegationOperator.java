package chapter2.applying_unary_operators;

public class NegationOperator {
    public static void main(String[] args) {

        double zooTemperature = 1.21;
        System.out.println(zooTemperature);
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature);
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature);

        /*
        * you cannot apply a negation operator (-) to a boolean expression,
        * nor can you apply a logical complement operator(!) to a numeric expression
        * */

//        int pelican = !5; //DOES NOT COMPILE
//        boolean penguin = -true; //DOES NOT COMPILE
//        boolean peacock = !0; //DOES NOT COMPILE

    }
}
