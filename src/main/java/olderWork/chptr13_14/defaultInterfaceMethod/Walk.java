package olderWork.chptr13_14.defaultInterfaceMethod;

public interface Walk {
    public default int getSpeed(){
        return 5;
    }
}
