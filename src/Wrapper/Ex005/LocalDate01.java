package Wrapper.Ex005;

import java.time.LocalDate;
import java.time.Month;


public class LocalDate01 {
    public static void main(String[]args){

       LocalDate date = LocalDate.of(2006, Month.MAY,11);
        LocalDate now = LocalDate.now();
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date);
        System.out.println(now);
    }
}
