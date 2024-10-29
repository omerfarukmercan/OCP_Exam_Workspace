package olderWork.chptr13_14.annotations;

public @interface Panda {
    Integer height = null;
    String[] generalInfo();
    Size size() default Size.SMALL;
    Bear friendlyBear = null;
    Exercise exercise() default @Exercise(hoursPerDay = 2);
}
