package chapter3.controlling_flow_with_branching;

public class NestedLoops {

    public static void main(String[] args) {

        int[][] complexArr = {{5, 4, 3, 2}, {3,9,6,9},{12,22,33,66}};

        for(int[] simpleArr : complexArr){
            for (int i = 0; i < simpleArr.length; i++) {
                System.out.print(simpleArr[i] + "\t");
            }
            System.out.println();
        }


    }
}
