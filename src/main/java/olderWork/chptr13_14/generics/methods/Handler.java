package olderWork.chptr13_14.generics.methods;

import olderWork.chptr13_14.generics.Crate;

public class Handler {
    public static <T> void prepare(T t){
        System.out.println("Preparing" + t);
    }

    public static <T> Crate<T> ship(T t){
        System.out.println("Shipping" + t);
        return new Crate<T>();
    }

}
