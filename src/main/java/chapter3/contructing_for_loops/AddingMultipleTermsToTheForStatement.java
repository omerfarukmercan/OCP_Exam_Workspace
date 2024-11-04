package chapter3.contructing_for_loops;

public class AddingMultipleTermsToTheForStatement {
    public static void main(String[] args) {

        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++){
            System.out.print(y + " ");
        }
        System.out.print(x + " ");


        /*
        * long y = 0, z = 4 -> initialization blocktaki degisken tipleri aynı olmalı, aralarinda virgul olmali
        * x < 5 && y < 10 -> boolean deger dondurmeli
        *
        * */
    }
}
