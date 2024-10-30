package olderWork.chptr13_14.localClass;

public class PrintNumbers {

    private int length = 5;
    public void calculate(){
        final int width = 20;
        class MyLocalClass{
            public void multiply(){
                System.out.print(length * width);
            }
        }
        MyLocalClass local = new MyLocalClass();
        local.multiply();
    }

    public static void main(String[] args) {
        PrintNumbers outer = new PrintNumbers();
        outer.calculate();
    }

}
