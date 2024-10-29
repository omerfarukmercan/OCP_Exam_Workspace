package olderWork.chapter16.locale;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatEx {

    public static void main(String[] args) throws ParseException {

        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));

        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));

        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));

        double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));

        String s = "40.45";
        var en = NumberFormat.getInstance(Locale.US);
        System.out.println(en.parse(s));

        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.parse(s));

        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance(Locale.US);
        double value = (Double) cf.parse(income);
        System.out.println(value);

        double d = 1234567.467;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d));//1.234.567,5
        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
        System.out.println(f2.format(d));//001.234.567,46700
        NumberFormat f3 = new DecimalFormat("$#,###,###.##");
        System.out.println(f3.format(d));//$1.234.567,47

    }

}
