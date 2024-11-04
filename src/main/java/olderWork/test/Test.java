package olderWork.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Output output = new Output();
        output.setChannel("MCR");

        Output output2 = new Output();
        output2.setChannel("INV");

        List<Output> outputList = new ArrayList<>();
        outputList.add(output);
        outputList.add(output2);

        List<Pre> preList = outputList.stream().map(Output::getChannel).map(Pre::new).toList();
        System.out.println(preList);


        int pig = 4;
        pig = pig++;
        System.out.println(pig);

    }
}
