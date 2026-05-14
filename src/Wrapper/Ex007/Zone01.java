package Wrapper.Ex007;

import java.time.ZoneId;
import java.util.Map;

public class Zone01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

    }
}