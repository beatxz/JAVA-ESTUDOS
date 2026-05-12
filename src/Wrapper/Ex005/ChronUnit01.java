package Wrapper.Ex005;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronUnit01 {
    public static void main(String[]args) {
        LocalDateTime birthday = LocalDateTime.of(2006, Month.MAY,11,00,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(birthday,now));
        System.out.println(ChronoUnit.YEARS.between(birthday,now));
        System.out.println(ChronoUnit.WEEKS.between(birthday,now));
        System.out.println(ChronoUnit.MONTHS.between(birthday,now));

    }
}
