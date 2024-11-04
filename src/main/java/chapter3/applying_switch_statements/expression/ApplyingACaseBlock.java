package chapter3.applying_switch_statements.expression;

public class ApplyingACaseBlock {


    private static void yieldRequired(){
         /*
        The yield keyword is equivalent to a return statement within a switch expression and is used to avoid ambiguity about
        whether you meant to exit the block or method around the switch expression.
         */
        int fish = 5;
        int length = 12;
        var name = switch(fish){
            case 1 -> "Goldfish";
            case 2 -> {
                //return "Troue"; // Return outside of enclosing switch expression
                yield "Trout";
            }
            case 3 ->{
                if(length > 10) yield "Blobfish";
                else yield "Green";
            }
            default -> "SwordFish";
        };
        System.out.println(name);
        // yield statements are not optional if the switch statement returns a value.
    }

}
