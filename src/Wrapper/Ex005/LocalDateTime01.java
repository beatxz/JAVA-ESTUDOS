package Wrapper.Ex005;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime01 {
    public static void main(String[]args){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2026-05-11");
        LocalTime time = LocalTime.parse("09:49:00");
        System.out.println(localDateTime);
        System.out.println(date);
        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);
    }
}
