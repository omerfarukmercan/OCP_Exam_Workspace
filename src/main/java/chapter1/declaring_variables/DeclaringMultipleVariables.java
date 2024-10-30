package chapter1.declaring_variables;

public class DeclaringMultipleVariables {

    // aynı tipte istedigimiz kadar variable declare edebiliriz
    void sandFence(){
        String s1, s2;
        String s3 = "yes", s4 = "no";
    }

    //sadece i3 initialize edilir
    void paintFence(){ int i1, i2, i3 = 0; }

    boolean b1, b2;
    String s1 = "1", s2;

    //int num, String value; DOES NOT COMPILE
    //double d1, double d2; DOES NOT COMPILE
    //int i3; i4; DOES NOT COMPILE

    int i1; int i2;

}
