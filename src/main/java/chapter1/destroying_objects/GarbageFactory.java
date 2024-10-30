package chapter1.destroying_objects;

import java.util.Date;

public class GarbageFactory {

    public static void main(String[] args) {

        Date d = getDate();
        //since the method returns the date object
        //it will not be eligible for collection even after the method has completed
        //the StringBuilder object, though, will be eligible
        //even though we didn't explicitly set te now variable to null

        doComplicatedStuff();
        System.out.println("d = " + d);

    }

    private static void doComplicatedStuff() {
    }

    private static Date getDate() {
        Date d2 = new Date();
        StringBuffer now = new StringBuffer(d2.toString());
        System.out.println(now);
        return d2;
    }

}
