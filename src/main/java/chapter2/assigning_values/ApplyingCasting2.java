package chapter2.assigning_values;

public class ApplyingCasting2 {
    public static void main(String[] args) {

        short mouse = 10;
        short hamster = 3;
//        short capybara = mouse * hamster; //DOES NOT COMPILE
        short capybara = (short) (mouse * hamster);

        System.out.println(capybara);

        //casting yaptigimiz zaman acikca overflow ve underflow kabul etmis oluruz


//        short capybara = (short) mouse * hamster; //DOES NOT COMPILE
//        short capybara = 1 + (short) (mouse * hamster); //DOES NOT COMPILE

    }
}
