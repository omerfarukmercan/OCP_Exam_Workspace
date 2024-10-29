package chapter1.understanding_package_declarations_and_imports;

//import java.nio.*;//dont compile
//import java.nio.file.*;//compiles
//import java.nio.*.*;//dont compile - you can only one wildcard and it must be at the end
//import java.nio.file.Paths.*;//dont compile - unused import
import java.nio.file.*;

public class InputImportsV2 {

    public void read(Files files){
        Paths.get("name");
    }

}
