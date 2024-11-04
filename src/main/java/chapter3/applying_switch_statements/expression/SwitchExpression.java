package chapter3.applying_switch_statements.expression;

public class SwitchExpression {

    public static void main(String[] args) {
        printDayOfWeek(1);
        printDayOfWeek(5);
        printDayOfWeek(10);
    }

    public static void printDayOfWeek(int day){
        var result = switch (day){
          case 0 -> "Sunday";
          case 1 -> "Monday";
          case 2 -> "Tuesday";
          case 3 -> "Wednesday";
          case 4 -> "ThursDay";
          case 5 -> "Friday";
          case 6 -> "Saturday";
          default -> "Invalid value";
        };
        System.out.println(result);
    }

    public static void printDayOfWeek2(int day){
        var result = switch (day){
            case 0 -> {
                yield "Sunday";
                //System.out.println("DOES NOT COMPILE");
            }
//            case 1 -> {"Monday"}; "DOES NOT COMPILE"
//            case 1 -> return "Monday"; "DOES NOT COMPILE"
            case 1 -> "Monday";
            //case 1 -> "Duplicate Label"; "DOES NOT COMPILE"
            case 2 -> {
                System.out.println("Valid");
                yield "Tuesday";
            }
            case 3 -> "Wednesday";
            case 4 -> "ThursDay";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid value"; // default branch is required
        };// deger atamasi yaptigimiz icin noktali virgul gerekiyor
        System.out.println(result);
    }

}
