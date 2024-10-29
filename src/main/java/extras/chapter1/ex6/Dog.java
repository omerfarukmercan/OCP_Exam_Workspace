package extras.chapter1.ex6;

public class Dog extends Animal{
    public static void main(String[] args) {
        System.out.println("Barking");
    }
}
// önce Animal sonra Dog sınıfı derlenmeli. Aşagidaki kod tum java classlari ayni anda derler
// javac *.java