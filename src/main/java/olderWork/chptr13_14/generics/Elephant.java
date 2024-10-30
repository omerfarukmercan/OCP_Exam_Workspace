package olderWork.chptr13_14.generics;

public class Elephant {

    private String name;

    public Elephant(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Elephant elephant = new Elephant("a");
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();
        System.out.println(inNewHome);
        Crate<Zebra> createForZebra = new Crate<>();
        Robot joeRobot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(joeRobot);
        Robot atDestination = robotCrate.emptyCrate();
    }

}
