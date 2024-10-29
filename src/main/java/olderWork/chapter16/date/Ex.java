package olderWork.chapter16.date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ex {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        LocalDate date1 = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalDate date2 = LocalDate.of(2020, 10, 20);

        System.out.println(date1);
        System.out.println(date2);

        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(6,15);
        var dt2 = LocalDateTime.of(date, time);
        System.out.println(dt2);

        LocalDate date3 = LocalDate.of(2020, Month.OCTOBER, 20);
        System.out.println(date3.getDayOfWeek());
        System.out.println(date3.getDayOfYear());
        System.out.println(date3.getMonth());
        System.out.println(date3.getYear());

        LocalDate date4 = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time4 = LocalTime.of(11,12, 34);

        LocalDateTime dt = LocalDateTime.of(date4, time4);
        System.out.println(date4.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time4.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f));

        var dt5 = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
        var formatter5 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        var formatter6 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
        //var formatter7 = DateTimeFormatter.ofPattern("h:mm z");
        System.out.println(dt5.format(formatter5));
        System.out.println(dt5.format(formatter6));
        //System.out.println(dt5.format(formatter7));

        System.out.println(dt5.format(formatter5));
        System.out.println(formatter5.format(dt5));

    }

}
