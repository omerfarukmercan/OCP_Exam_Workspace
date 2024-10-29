package olderWork.chptr13_14.annotations;

public @interface ElectricitySource {
    int voltage();
    int MIN_VOLTAGE = '2';
    static final int MAX_VOLTAGE = 18;
}
