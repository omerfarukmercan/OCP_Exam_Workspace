package chapter1.understanding_data_types;

public class NumberSystems {
    public static void main(String[] args) {


        int octalVar1 = 017;

        int octalVar2 = 025;
        //int octalVar3 = 038;//does not compile

        System.out.println(octalVar1);
        System.out.println(octalVar2);

        int hex1 = 0xFF;
        int hex2 = 0X234;
        //int hex3 = 0Xcafeg;//does not compile

        System.out.println(hex1);
        System.out.println(hex2);


        int binary1 = 0b10;
        int binary2 = 0B1101;
        //int binary3 = 0B2101;//does not compile

    }
}
