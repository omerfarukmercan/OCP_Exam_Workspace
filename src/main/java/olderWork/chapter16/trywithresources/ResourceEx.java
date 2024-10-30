package olderWork.chapter16.trywithresources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ResourceEx {

    public static void main(String[] args) throws IOException {

        var writer = Files.newBufferedWriter(Path.of("C:\\Users\\PC\\IdeaProjects\\OCPExam\\deneme.txt"));
        writer.append("This is permitted");
        try(writer){
            writer.append("asdasd");
        }
        writer.append("asdasd");
    }

}
