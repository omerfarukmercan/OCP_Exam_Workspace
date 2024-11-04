package chapter3.contructing_for_loops;

import java.util.List;

public class ForEachStatement {

    void printNames(String[] names){
        for (var name : names){
            System.out.println(name);
        }
    }

    void printNames2(List<String> names){
        for (var name : names){
            System.out.println(name);
        }
    }

}
