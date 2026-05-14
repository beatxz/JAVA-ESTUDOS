package Wrapper.Ex006;

import java.time.LocalDate;

public class TemporalAdjuster01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        now = now.plusDays(20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}
