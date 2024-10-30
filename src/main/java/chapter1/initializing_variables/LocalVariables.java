package chapter1.initializing_variables;

public class LocalVariables {

    void sampleKeywordsForLocalVariables(){
        /*
        local degisken constructor, method veya initilizer blockta tanimlanan degiskenlerdir.
        stack memoryde tutulduklari icin stack degiskenlerde denilirler
        loca degiskenler otomatik initilize edilmezler

        local degiskenler sadece final keyword alabilirler asagidakileri alamazlar.

        private int secret = 10; DOES NOT COMPILE
        public int number = 100; DOES NOT COMPILE
        static int size = 20; DOES NOT COMPILE
        abstract int age = 25; DOES NOT COMPILE
        volatile int counter = 10; DOES NOT COMPILE
        transient int life = 50; DOES NOT COMPILE
        */

        final int valid = 200;
    }

}
