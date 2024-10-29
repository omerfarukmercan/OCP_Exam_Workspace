package olderWork.chptr13_14.generics.bounding;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void printList(List<?> list){
        for (Object x: list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);

        List<?> x1 = new ArrayList<>();
        var x2 = new ArrayList<>();

        //ArrayList<Number> list = new ArrayList<Integer>();//DOES NOT COMPILE
        List<? extends Number> list = new ArrayList<Integer>();

        List<? extends Bird> birds = new ArrayList<Bird>();
        //birds.add(new Sparrow());
        //birds.add(new Bird());
        List<Flyer> flyers = new ArrayList<>();
        flyers.add(new HangGlider());
        flyers.add(new Goose());
        anyFlyer(flyers);
        groupOfFlyers(flyers);
        List<Goose> gooseList = new ArrayList<>();
        //anyFlyer(gooseList);//DOES NOT COMPILE
        groupOfFlyers(gooseList);
        List<HangGlider> hangGliderList = new ArrayList<>();
        //anyFlyer(hangGliderList);//DOES NOT COMPILE
        groupOfFlyers(hangGliderList);
    }
    private static void anyFlyer(List<Flyer> flyer){
    }
    private static void groupOfFlyers(List<? extends Flyer> flyer){
    }

    public static long total(List<? extends Number> list){
        long count = 0;
        for(Number number: list){
            count += number.longValue();
        }
        return count;
    }

    static class Sparrow extends Bird {}
    static class Bird {}


}
