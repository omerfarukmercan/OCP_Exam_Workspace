package olderWork.chapter16.suppress;

public class JammedTurkeyCage implements AutoCloseable{

    public void close() throws IllegalStateException{
        throw new IllegalStateException("Cage door does not closed");
    }

    public static void main(String[] args) {
        /*try(JammedTurkeyCage t = new JammedTurkeyCage()){
            throw new IllegalStateException("Turkey run off");
        }catch (IllegalStateException e){
            System.out.println("Cought" + e.getMessage());
            for(Throwable t: e.getSuppressed()){
                System.out.println("Suppressed:" + t.getMessage());
            }
        }*/

        try(JammedTurkeyCage t = new JammedTurkeyCage()){
            throw new RuntimeException("Turkeys run off");
        }
        catch (IllegalStateException e){
            System.out.println("Caught: "  + e.getMessage());
        }

    }

}
