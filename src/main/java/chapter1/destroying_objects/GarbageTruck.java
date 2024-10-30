package chapter1.destroying_objects;

public class GarbageTruck {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);
        //the StringBuffer object is NOT eligible for collection
        sb = null;
        //now the StringBuffer object is eligible for collection


    }
}
