package chapter3.controlling_flow_with_branching;

public class AddingOptionalLabels2 {

    public static void main(String[] args) {

        int frog = 15;
        BAD_IDEA: // labeldan sonra kod gelmezse "label without statement" compile hatasi veriyor
        if(frog > 10) EVEN_WORSE_IDEA:{
            frog++;
        }

    }

}
