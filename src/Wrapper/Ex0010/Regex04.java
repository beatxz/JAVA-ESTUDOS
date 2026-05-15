package Wrapper.Ex0010;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex04 {
    public static void main(String[] args) {

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: "+text);
        System.out.println("indices: 0123456789");
        System.out.println("regex : "+regex);
        System.out.println("Find positions: ");

        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
