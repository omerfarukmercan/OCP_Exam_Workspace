package olderWork.chptr13_14.anonymousClass;

public class ZooGiftShop2 {

    interface SaleTodayOnly{
        int dolarsOff();
    }

    public int pay(){
        return admission(5, new SaleTodayOnly() {
           public int dolarsOff(){return 3;}
        });
    }

    public int admission(int basePrice, SaleTodayOnly sale){
        return basePrice - sale.dolarsOff();
    }

    public static void main(String[] args) {
        ZooGiftShop2 zooGiftShop = new ZooGiftShop2();
        zooGiftShop.pay();
    }

}
