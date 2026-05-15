package Wrapper.Ex0010;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex05 {
    public static void main(String[] args) {

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-z])+(\\.([a-zA-z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("#@!zoro@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: " + text);
        System.out.println("indices: 0123456789");
        System.out.println("regex : " + regex);
        System.out.println("Find positions: ");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
