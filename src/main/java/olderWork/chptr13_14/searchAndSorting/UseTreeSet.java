package olderWork.chptr13_14.searchAndSorting;

import olderWork.chptr13_14.comparable.comparator.Duck;

import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
    static class Rabbit { int id;}

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles", 2));
        Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id - r2.id);
        rabbits.add(new Rabbit());
    }
}
