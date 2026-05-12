package Wrapper.Ex005;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Duration01 {
    public static void main(String[]args){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        Duration d1 = Duration.between(now,nowAfterTwoYears);
        System.out.println(d1);

    }
}
