package Wrapper.Ex008;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat01 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        String schedule = date.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy"));
        System.out.println(schedule);
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



    }
}
