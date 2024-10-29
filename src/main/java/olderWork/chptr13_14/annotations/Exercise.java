package olderWork.chptr13_14.annotations;

public @interface Exercise {
    int hoursPerDay();
    int startHour() default 6;
}
