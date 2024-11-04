package chapter3.controlling_flow_with_branching;

public class AddingOptionalLabels {

    public static void main(String[] args) {

        int[][] complexArr = {{5, 4, 3, 2}, {3,9,6,9},{12,22,33,66}};
        OUTER_LOOP: //label
        for(int[] simpleArr : complexArr){
            INNER_LOOP:
            for (int i = 0; i < simpleArr.length; i++) {
                System.out.print(simpleArr[i] + "\t");
            }
            System.out.println();
        }


    }

}
