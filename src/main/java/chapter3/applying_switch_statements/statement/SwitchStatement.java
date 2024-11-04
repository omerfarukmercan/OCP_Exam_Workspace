package chapter3.applying_switch_statements.statement;

public class SwitchStatement {

    public static void main(String[] args) {


        Season season = Season.SUMMER;

        switch (season){
            case FALL:
                System.out.println("cool");
                break;
            case WINTER:
                System.out.println("Cold");
                break;
            case SUMMER:
                System.out.println("Hot");
                break;
            case SPRING:
                System.out.println("Warm");
                break;
        }

    }

}

enum Season {
    SPRING, SUMMER,WINTER, FALL
}