package chapter2.comparing_values;

public class ConditionalOperators {
    public static void main(String[] args) {


        int hour = 10;
        boolean zooOpen = true || (hour < 4);
        System.out.println(zooOpen);

        String str = null;
        System.out.println(str != null && str.contains("value"));

    }

    /*
    * logical operatorlar her kosulda kodun iki tarafini da calistirir
    * conditional operatorler ise AND veya OR icin ilk conditionda gerekli kosul saglandiysa ikincisini calistirmaz
    * */
}
