package chapter3.creating_decision_making_statements;

public class PatternMatching {
    public static void main(String[] args) {
        compareIntegersV1(100);
        compareIntegersV2(200);
    }

    static void compareIntegersV1(Number number){
        if(number instanceof Integer){
            Integer data = (Integer) number;
            System.out.println(data.compareTo(5));
        }
    }

    static void compareIntegersV2(Number number){
        if(number instanceof Integer data){
            System.out.println(data.compareTo(5));
        }
    }

}
