package chapter1.understanding_data_types;

public class DistinguishingPrimitiveAndReferenceTypes {
    public static void main(String[] args) {
        //primitive'lerin hepsi kucuk harfle baslar. classlar buyuk harfle baslar
        //reference type uzerinden method cagirilabilir. primitive de method cagirimi olmaz
        String reference = "hello";
        int len = reference.length();
        //int bad = len.lenght();//does not compile

        //primitive types will give u a compiler error if u attempt to assign them null
        //int value = null;//does not compile
        String name = null;
    }
}
