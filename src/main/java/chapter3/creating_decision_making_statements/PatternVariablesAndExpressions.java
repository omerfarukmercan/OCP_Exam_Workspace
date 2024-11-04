package chapter3.creating_decision_making_statements;

public class PatternVariablesAndExpressions {

    static void printIntegersGreaterThan5(Number number){
        if(number instanceof Integer data && data.compareTo(5) > 0) {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        printIntegersGreaterThan5(10);
        printIntegersGreaterThan5(15);
        printIntegersGreaterThan5(3);
    }

}
