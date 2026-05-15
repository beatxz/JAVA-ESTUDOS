package Wrapper.Ex0010;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex06 {
    public static void main(String[] args) {

        String regex = "\\d+";
        String text = "Isabela is 20 years old, Fabiane is 50, and Beatriz is 28.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
