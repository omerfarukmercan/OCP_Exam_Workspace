package olderWork.chptr13_14.annotations.repeateable;

public class Zoo {
    public static class Monkey{}
    @Risk(danger = "Silly")
    @Risk(danger = "Aggressive", level = 5)
    @Risk(danger = "Violent", level = 10)
    private Monkey monkey;
}
