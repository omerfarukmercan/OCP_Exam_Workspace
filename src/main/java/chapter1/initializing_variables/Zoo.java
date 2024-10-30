package chapter1.initializing_variables;

public class Zoo {

    //var sadece local degiskenlerde kullanilir
    //local variable type inference olarak gecer
    // var degisken tanimlagimiz yerde bu degiskene deger atamamiz gerekir yoksa compile olmaz
    //var degiskene null deger atanamaz
    //method ve constructor parametrelerinde var kullanilamaz

    public void whatTypeAmI(){
        var name = "Hello";
        var size = 7;
    }

}
