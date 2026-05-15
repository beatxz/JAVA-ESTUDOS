package Wrapper.Ex0010;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex07 {
    public static void main(String[] args) {

        String regex = "([a-zA-z0-9_-]+@[a-zA-Z]+(\\.([a-zA-Z])+)+)";
        String text = "contato@gmail.com, teste@teste, #email@hotmail.com, biazinha_123@yahoo.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }

    }
}
