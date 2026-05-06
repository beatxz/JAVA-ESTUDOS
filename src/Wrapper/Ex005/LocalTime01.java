package Wrapper.Ex005;

import java.time.LocalTime;

public class LocalTime01 {
    public static void main(String[]args){
        LocalTime time = LocalTime.of(23,32,12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(timeNow.getMinute());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

    }
}
