package olderWork.chptr13_14.comparable;

public class LegacyDuck implements  Comparable{
    private String name;
    public int compareTo(Object obj){
        LegacyDuck d = (LegacyDuck) obj;
        return name.compareTo(d.name);
    }
}
