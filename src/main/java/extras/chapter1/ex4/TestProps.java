package extras.chapter1.ex4;

import java.util.Properties;

public class TestProps {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        String myProp = System.getProperty("myProp");
        System.out.println("property value: " + myProp);
        System.out.println(props);
    }
}

//java -DmyProp="cool parameter" extras.chapter1.ex4.TestProps
//-D ile parameter tanimlariz