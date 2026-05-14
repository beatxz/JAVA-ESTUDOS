package Wrapper.Ex006;

import java.time.LocalDate;

public class DateNow {
   public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDate dateDays = LocalDate.now().plusDays(30);
        LocalDate dateAfter = LocalDate.now().minusMonths(2);
        System.out.println(date);
        System.out.println(dateDays);
       System.out.println(dateAfter);

    }
}
