package chapter1.understanding_package_declarations_and_imports.packageb;

import chapter1.understanding_package_declarations_and_imports.packagea.ClassA;
// ClassA'yi import etmemiz gerekiyor cunku farkli paketlerde yer aliyorlar.

public class ClassB {
    public static void main(String[] args) {
        ClassA classA;
        System.out.println("Got it");
    }
}
