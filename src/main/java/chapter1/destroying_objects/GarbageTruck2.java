package chapter1.destroying_objects;

public class GarbageTruck2 {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("hello");
        StringBuffer s2 = new StringBuffer("goodbye");
        System.out.println(s1);
        //at this point the StringBuffer "hello" is not eligible
        s1 = s2;
        // now the StringBuffer "hello" is eligible for collection
    }
}
