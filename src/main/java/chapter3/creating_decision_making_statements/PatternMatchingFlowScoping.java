package chapter3.creating_decision_making_statements;

public class PatternMatchingFlowScoping {
    /*
    If the input does not inherit Integer, the data variable is undefined.
    Since the compiler cannot guarantee that data is an instance of Integer,
    data is not in scope, and the code does not compile.
     */
    void printIntegersOrNumbersGreaterThan5(Number number) {
        //    if (number instanceof Integer data || data.compareTo(5) > 0) // DOES NOT COMPILE
        //        System.out.print(data);
    }

}
