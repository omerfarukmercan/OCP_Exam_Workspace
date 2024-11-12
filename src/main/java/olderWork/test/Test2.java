package olderWork.test;


public class Test2 {
    public static void main(String[] args) {

        int temp = 4;
        long humidity = -temp + temp * 3;

        if(temp >= 4)
            if (humidity < 7)
                System.out.println("Too Low");
            else{
                System.out.println("Just Right");
            }
        else{
            System.out.println("Too high");
        }
        System.out.println();
        int[] arr = {1,2,3,4};
        //print(arr);

        System.out.println();
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        int q = wolf.length;
        for (;;) {
            System.out.println(wolf[--q]);
            if(q == 0) break;
        }

        System.out.println();
        String content = "abc dda fag";
        System.out.println(content.lastIndexOf("a", 3));
    }

    //Method parametreleri doğrudan değiştirilmedikleri sürece effectively final olarak değerlendirilir
    void printReptile(int category){
        var type = switch (category){
            case 1,2 -> "Snake";
            case 3,4 -> "Snake";
            default -> "Here";
        };
        System.out.println(type);
    }

    private static void print(int[] weaether){
        for (int i = 0; i <= weaether.length; ++i) {
            System.out.println(weaether[i]);
        }

    }

    private DayOfWeek getWeekDay(int day, final int thursday){
        int otherDay = day;
        int Sunday = 0;
        switch (otherDay){
            default:
            //case 1: continue;
            // thurday: return DayOfWeek.MONDAY;
            case 2,10:break;
            //case Sunday: return DayOfWeek.SUNDAY;
            //case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;
        }
        return DayOfWeek.SUNDAY;
    }

    //enum class'ın içinde tanımlanabilir
    enum DayOfWeek {
        MONDAY,SUNDAY
    }

    //pattern matching flow scoping means a pattern vaiable is only accesible if the compiler can discern its type.
    //unutma
    // In particular, it is possible to use a pattern variable outside of the if statement,
    // but only when the compiler can definitively determine its type.
}

