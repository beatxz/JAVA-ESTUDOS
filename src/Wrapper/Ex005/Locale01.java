package Wrapper.Ex005;

import java.util.Locale;

public class Locale01 {
    public static void main(String[]args){
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

    }
}
