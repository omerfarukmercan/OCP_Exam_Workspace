package olderWork.chapter16.locale;

import java.util.Locale;

public class LocaleEx {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);

        System.out.println(new Locale("fr"));
        System.out.println(new Locale("hi", "IN"));
        Locale.of("fr");

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        System.out.println(l1);

        Locale.setDefault(l1);
        System.out.println(Locale.getDefault());

    }

}
