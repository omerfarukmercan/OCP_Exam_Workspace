package chapter3.creating_decision_making_statements;

public class PatternMatchingFlowScoping2 {

    void printIntegerTwice(Number number){
        if(number instanceof Integer data)
            System.out.println(data.intValue());
//            System.out.println(data.intValue()); //DOES NOT COMPILE
    }

    void printIntegerTwice2(Number number){
        if(number instanceof Integer data){
            System.out.println(data.intValue());
        }
//        System.out.println(data.intValue());//DOES NOT COMPILE
    }

    void printIntegerTwice3(Number number){
        if(number instanceof Integer data){
            System.out.println(data.intValue());
            System.out.println(data.intValue());
        }
    }

}
