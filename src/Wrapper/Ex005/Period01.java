package Wrapper.Ex005;

import java.time.LocalDate;
import java.time.Period;

public class Period01 {
    public static void main(String[]args) {

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(10);
        Period p1 = Period.between(now, nowAfterTwoYears);
        System.out.println(p1);
    }
}
