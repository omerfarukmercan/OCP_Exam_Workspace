package chapter1.initializing_variables;

public class VarExamples {

    // var class interface veya enum ismi icin kullanilmaz. reserved type name olarak gecer.
    //var' in degeri degisebilir ama tipi degisemez

    //var exampleVar = 3; DOES NOT COMPILE

    /*public void doesThisCompile(boolean check){
        var question;
        question = 1;

        var question2
                = 1;

        var question3
        question3 = 1;

        var answer;
        if(check){
            answer = 2;
        }else{
            answer = 3;
        }
        System.out.println(answer);
    }*/

    public void reAssignment(){
        var number = 7;
        number = 4;
        //number = "five"; DOES NOT COMPILE
    }

    public void twoTypes(){
        //int a, var b = 3; DOES NOT COMPILE
        //var n = null; DOES NOT COMPILE
        //var a = 3, b = 5; var ile birden fazla initialization yapilamaz
    }

    public void nullVar(){
        // degisken tipi belli oldugu icin null atanabilir.
        var str = (String) null;
        str = "content";

        var size = (Integer) null;
        size = 200;
    }

    /*public int addition(var a, var b){
        return a + b;
    }*/

    public void primitiveControl(){
        var size = 10;
        //size = null; DOES NOT COMPILE

        var age = (Integer) 50;
        age = null;
    }

}
