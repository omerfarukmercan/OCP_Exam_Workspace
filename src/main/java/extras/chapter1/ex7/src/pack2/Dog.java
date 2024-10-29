package extras.chapter1.ex7.src.pack2;

import extras.chapter1.ex7.src.pack1.Animal;

public class Dog extends Animal {
    public static void main(String[] args) {
        System.out.println("Barking 2 ....");
    }
}

//javac -cp src src/pack2/Dog.java
//java -cp . pack2/Dog
//. current directory demek oluyor
//-cp  =  -classpath  =  --class-path


//jar -cvf myNewFile.jar
//jar --create--verbose--file myNewFile.jar