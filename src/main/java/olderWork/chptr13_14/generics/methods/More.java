package olderWork.chptr13_14.generics.methods;

public class More {
    public static <T> void sink(T t){};
    public static <T> T identity(T t){return t;};
    //public static T noGood(T t ){return t;} //DOES NOT COMPILE

    public static void main(String[] args) {
        More.<String>identity("package");
    }
}
