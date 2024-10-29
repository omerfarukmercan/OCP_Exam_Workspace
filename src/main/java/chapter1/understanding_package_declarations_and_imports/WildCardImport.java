package chapter1.understanding_package_declarations_and_imports;

//import java.util.*; dont compile

//import java.util.concurrent.*; dont compile

import java.util.concurrent.atomic.*;//compiles

//import java.util.concurrent.atomic.AtomicInteger;//compiles

public class WildCardImport {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println(atomicInteger.get());
    }
}

//java.lang otomatik olarak import edilir.
