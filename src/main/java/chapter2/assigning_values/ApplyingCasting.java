package chapter2.assigning_values;

public class ApplyingCasting {

    public static void main(String[] args) {

        int fish = (int) 1.0;
        short bird = (short) 1921222;// Stored as 20678
        int mammal = (int) 9f;
        //long reptile = (long) 123123512361234; //DOES NOT COMPILE
        long reptile2 = 123123512361234L;

        System.out.println(fish);
        System.out.println(bird);
        System.out.println(mammal);
        System.out.println(reptile2);


    }

}
