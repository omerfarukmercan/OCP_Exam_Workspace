package olderWork.chptr13_14.anonymousClass;

public class ZooGiftShop {

    interface SaleTodayOnly{
        int dollarsOff();
    }

    public int admission(int basePrice){
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        ZooGiftShop zooGiftShop = new ZooGiftShop();
        System.out.println(zooGiftShop.admission(5));
    }

}
