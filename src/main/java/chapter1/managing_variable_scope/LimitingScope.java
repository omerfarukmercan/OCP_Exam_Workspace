package chapter1.managing_variable_scope;

public class LimitingScope {

    public void eatIfHungry(boolean hungry){
        if(hungry){
            int biteOfCheese = 1 ;
        }//biteOfCheese goes out of scope here
        //System.out.println(biteOfCheese); DOES NOT COMPILE
    }

    public void eatIfHungry2(boolean hungry){
        if(hungry){
            int biteOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(biteOfCheese);
            }
            //System.out.println(teenyBit); DOES NOT COMPILE
        }
        //System.out.println(teenyBit); DOES NOT COMPILE
    }

}
