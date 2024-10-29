package olderWork.chptr13_14.localClass;

public class ProcessData {

    public static void processData(){
        final int lenght = 5;
        int width = 10;
        int height = 2;
        class VolumeCalculator{
            public int multiply(){
                System.out.println(lenght * width * height);
                return lenght * width * height;
            }
        }
        VolumeCalculator volumeCalculator = new VolumeCalculator();
        volumeCalculator.multiply();
        //width = 6; does not compile
    }

    public static void main(String[] args) {
        processData();
    }

}
