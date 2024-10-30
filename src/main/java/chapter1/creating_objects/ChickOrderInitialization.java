package chapter1.creating_objects;

public class ChickOrderInitialization {

    /*
    * order matters for the fields and blocks of code
    * you cant refer to a variable before it has been defined
    * */
    /*
    {
        System.out.println(name);//does not compile
    }
    */
    private String name = "Fluffy";

    {
        System.out.println("setting field");
    }

    public ChickOrderInitialization(){
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        ChickOrderInitialization chickOrderInitialization = new ChickOrderInitialization();
        System.out.println(chickOrderInitialization.name);
    }

    //önce instance initializer ve blocklar calisir ve sonrasinda constructor calilsir
    // initilization blocklarda siralamaya gore calisir

    {
        System.out.println("setting field 2");
    }
}
