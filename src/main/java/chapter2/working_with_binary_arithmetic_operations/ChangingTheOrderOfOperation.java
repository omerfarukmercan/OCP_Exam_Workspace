package chapter2.working_with_binary_arithmetic_operations;

public class ChangingTheOrderOfOperation {
    public static void main(String[] args) {

        int price = 2 * 5 + 3 * 4 - 8;
        System.out.println(price);//14

        int priceOrder = 2 * ((5 + 3) * 4 - 8);//48
        System.out.println(priceOrder);

    }
}
