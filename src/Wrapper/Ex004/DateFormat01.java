package Wrapper.Ex004;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormat01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[6];
        df[0] = DateFormat.getDateInstance();
        df[1] = DateFormat.getInstance();
        df[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[4] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}