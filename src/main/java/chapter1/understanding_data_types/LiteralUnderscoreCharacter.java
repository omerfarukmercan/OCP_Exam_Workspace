package chapter1.understanding_data_types;

public class LiteralUnderscoreCharacter {
    public static void main(String[] args) {

        int million1 = 1000000;
        int million2 = 1_000_000;


        //double notAtStart = _1000_.00;//does not compile
        //double notAtEnd = 1000.00_;//does not compile
        //double notByDecimal = 1000_.00;//does not compile
        //double notAfterDecimal = 1000._00;//does not compile
        double annoyingButLegal = 1_00_0.0_0;
        double reallyUgly = 1________2;

    }
}
